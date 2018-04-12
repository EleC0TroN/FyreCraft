package com.flashfyre.fyrecraft.world.biomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class TropicalLakes extends Biome {
	
	public TropicalLakes() {
		
		super(new BiomeProperties("Tropical Lakes").setBaseHeight(-0.3F).setHeightVariation(0.2F).setTemperature(0.95F).setRainfall(0.8F));
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.generateFalls = true;
        this.decorator.treesPerChunk = 1;
        this.decorator.flowersPerChunk = 4;
        this.decorator.grassPerChunk = 10;
        this.decorator.sandPatchesPerChunk = 4;
        this.decorator.waterlilyPerChunk = 5;
	}

}
