package com.flashfyre.fyrecraft.world.biome.provider;

import com.google.common.collect.Lists;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.storage.WorldInfo;

public class BiomeProviderMultiple extends BiomeProvider {

	public BiomeProviderMultiple(Biome... biomes) {
		super();
		BiomeProviderMultiple.allowedBiomes = Lists.newArrayList(biomes);
	}

	public BiomeProviderMultiple(WorldInfo info) {
		super(info);
	}

}