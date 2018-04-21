package com.flashfyre.fyrecraft.world.biomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class MushroomGrove extends Biome {
	
	public MushroomGrove() {
		
		super(new BiomeProperties("Mushroom Grove").setTemperature(0.8F).setRainfall(0.8F));
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = 6;
		this.decorator.grassPerChunk = 6;
		this.decorator.bigMushroomsPerChunk = 2;
		this.decorator.flowersPerChunk = 2;
		this.decorator.mushroomsPerChunk = 5;
		
	}
}