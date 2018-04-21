package com.flashfyre.fyrecraft.world.biomes;

import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSand.EnumType;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class RedDesert extends Biome {
	
	public RedDesert() {
		
		super(new BiomeProperties("Red Desert").setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(2.0F).setRainDisabled());
		
		topBlock = Blocks.SAND.getDefaultState().withProperty(BlockSand.VARIANT, EnumType.RED_SAND);
		fillerBlock = Blocks.SAND.getDefaultState().withProperty(BlockSand.VARIANT, EnumType.RED_SAND);

		this.decorator.treesPerChunk = -999;
        this.decorator.deadBushPerChunk = 2;
        this.decorator.reedsPerChunk = 50;
        this.decorator.cactiPerChunk = 10;
	}
}