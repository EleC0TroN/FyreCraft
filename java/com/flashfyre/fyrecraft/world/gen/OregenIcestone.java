package com.flashfyre.fyrecraft.world.gen;

import java.util.Random;

import com.flashfyre.fyrecraft.init.BlockInit;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.TempCategory;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OregenIcestone implements IWorldGenerator {
	
	private WorldGenerator icestone_oregen;
	
	public OregenIcestone() {
		
		icestone_oregen = new WorldGenMinable(BlockInit.ICESTONE.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.STONE));				
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		runGenerator(icestone_oregen, world, random, chunkX, chunkZ, 10, 45, 80);
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		
		Biome biome = world.getBiome(new BlockPos(blockX, 64, blockZ));		
		TempCategory biometemp = biome.getTempCategory();
		
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds.");
		int heightDiff = maxHeight - minHeight + 1;
		
		if(biometemp == TempCategory.COLD) {
			for(int i = 0; i < chance; i++) {
				int x = chunkX * 16 + rand.nextInt(16);
				int y = minHeight + rand.nextInt(heightDiff);
				int z = chunkZ * 16 + rand.nextInt(16);
				
				gen.generate(world, rand, new BlockPos(x,y,z));
			}
		}
	}

}

