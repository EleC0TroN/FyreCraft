package com.flashfyre.fyrecraft.world.biomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class RockyWasteland extends Biome {
	
	public RockyWasteland() {
		
		super(new BiomeProperties("Rocky Wasteland").setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(0.2F));
		
		topBlock = Blocks.AIR.getDefaultState();
		fillerBlock = Blocks.STONE.getDefaultState();
	}
}