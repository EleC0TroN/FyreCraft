package com.flashfyre.fyrecraft.world.biomes;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;

public class TropicalDesert extends Biome {
	
	public IBlockState usualTopBlock;
	public IBlockState altTopBlock;
	
	public TropicalDesert() {
		
		super(new BiomeProperties("Tropical Desert").setBaseHeight(0.125F).setHeightVariation(0.2F).setTemperature(0.95F).setRainfall(0.8F));
		
		this.topBlock = Blocks.SAND.getDefaultState();
        this.fillerBlock = Blocks.SAND.getDefaultState();
        this.usualTopBlock = this.topBlock;
        this.altTopBlock = Blocks.GRASS.getDefaultState();
		
		this.decorator.generateFalls = true;
        this.decorator.treesPerChunk = 1;
        this.decorator.flowersPerChunk = 2;
        this.decorator.grassPerChunk = 4;
        this.decorator.sandPatchesPerChunk = 1;
        this.decorator.cactiPerChunk = 5;
	}
	
	@Override
	public void genTerrainBlocks(World world, Random rand, ChunkPrimer primer, int x, int z, double noise) {
		this.topBlock = (noise + rand.nextDouble() * 1.0D > 2.5) ? this.altTopBlock : usualTopBlock;
		super.genTerrainBlocks(world, rand, primer, x, z, noise);
	}
}
