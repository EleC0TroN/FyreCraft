package com.flashfyre.fyrecraft.world.biomes;

import com.flashfyre.fyrecraft.init.BlockInit;

import net.minecraft.world.biome.Biome;

public class VolcanicWasteland extends Biome {
	
	public VolcanicWasteland() {
		
		super(new BiomeProperties("Volcanic Wasteland").setBaseHeight(0.125F).setHeightVariation(0.075F).setTemperature(2.0F).setRainDisabled());
		
		topBlock = BlockInit.PUMICE.getDefaultState();
		fillerBlock = BlockInit.PUMICE.getDefaultState();

		this.decorator.treesPerChunk = -999;
	}
}