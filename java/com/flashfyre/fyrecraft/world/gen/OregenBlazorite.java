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

public class OregenBlazorite implements IWorldGenerator {
	
private WorldGenerator blazorite_oregen;
	
	public OregenBlazorite() {
		
		blazorite_oregen = new WorldGenMinable(BlockInit.BLAZORITE_ORE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK));				
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		runGenerator(blazorite_oregen, world, random, chunkX, chunkZ, 4, 106, 126);
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