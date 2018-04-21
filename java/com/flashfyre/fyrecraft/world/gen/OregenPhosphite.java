package com.flashfyre.fyrecraft.world.gen;

import java.util.Random;

import com.flashfyre.fyrecraft.init.BlockInit;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OregenPhosphite implements IWorldGenerator {
	
	private WorldGenerator phosphite_oregen;
	
	public OregenPhosphite() {
		
		phosphite_oregen = new WorldGenMinable(BlockInit.PHOSPHITE_ORE.getDefaultState(), 10, BlockMatcher.forBlock(Blocks.STONE));				
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		runGenerator(phosphite_oregen, world, random, chunkX, chunkZ, 10, 20, 128);
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 255) throw new IllegalArgumentException("Ore generated out of bounds.");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}

}
