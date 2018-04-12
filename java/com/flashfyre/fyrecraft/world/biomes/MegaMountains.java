package com.flashfyre.fyrecraft.world.biomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class MegaMountains extends Biome {
	
	public MegaMountains() {
		
		super(new BiomeProperties("Mega Mountains").setBaseHeight(1.2F).setHeightVariation(0.6F).setTemperature(0.2F).setRainfall(0.3F));
		
		topBlock = Blocks.STONE.getDefaultState();
		fillerBlock = Blocks.STONE.getDefaultState();
	}
}