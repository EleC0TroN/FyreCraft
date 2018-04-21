package com.flashfyre.fyrecraft.world.gen;

import java.util.Random;

import com.flashfyre.fyrecraft.init.BiomeInit;
import com.flashfyre.fyrecraft.init.BlockInit;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OregenVulcanite implements IWorldGenerator {
	
	private WorldGenerator vulcanite_oregen;
	
	public OregenVulcanite() {
		
		vulcanite_oregen = new WorldGenMinable(BlockInit.VULCANITE_ORE.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));				
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		runGenerator(vulcanite_oregen, world, random, chunkX, chunkZ, 5, 8, 32);
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		
		Biome biome = world.getBiome(new BlockPos(blockX, 64, blockZ));
		
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 255) throw new IllegalArgumentException("Ore generated out of bounds.");
		int heightDiff = maxHeight - minHeight + 1;
		
		if(biome == Biomes.EXTREME_HILLS || biome == Biomes.EXTREME_HILLS_WITH_TREES || biome == Biomes.MUTATED_EXTREME_HILLS || biome == Biomes.MUTATED_EXTREME_HILLS_WITH_TREES || biome == BiomeInit.MEGA_MOUNTAINS ) {
			for(int i = 0; i < chance; i++) {
				int x = chunkX * 16 + rand.nextInt(16);
				int y = minHeight + rand.nextInt(heightDiff);
				int z = chunkZ * 16 + rand.nextInt(16);
				
				gen.generate(world, rand, new BlockPos(x,y,z));
			}
		}
	}

}
