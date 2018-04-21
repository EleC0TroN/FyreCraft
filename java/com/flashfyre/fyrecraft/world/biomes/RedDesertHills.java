package com.flashfyre.fyrecraft.world.biomes;

import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSand.EnumType;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class RedDesertHills extends Biome {
	
	public RedDesertHills() {
		
		super(new BiomeProperties("Red Desert Hills").setBaseHeight(0.45F).setHeightVariation(0.3F).setTemperature(2.0F).setRainDisabled());
	
		topBlock = Blocks.SAND.getDefaultState().withProperty(BlockSand.VARIANT, EnumType.RED_SAND);
		fillerBlock = Blocks.SAND.getDefaultState().withProperty(BlockSand.VARIANT, EnumType.RED_SAND);
	
		this.decorator.treesPerChunk = -999;
        this.decorator.deadBushPerChunk = 2;
        this.decorator.reedsPerChunk = 50;
        this.decorator.cactiPerChunk = 10;
	}

}
