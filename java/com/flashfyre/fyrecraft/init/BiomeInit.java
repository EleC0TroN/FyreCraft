package com.flashfyre.fyrecraft.init;

import com.flashfyre.fyrecraft.world.biomes.*;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit {
	
	public static final Biome ROCKY_WASTELAND = new RockyWasteland();	
	public static final Biome MUSHROOM_GROVE = new MushroomGrove();
	public static final Biome TROPICAL_LAKES = new TropicalLakes();
	public static final Biome TROPICAL_DESERT = new TropicalDesert();
	public static final Biome MEGA_MOUNTAINS = new MegaMountains();
	
	public static void registerBiomes() {
		initBiome(9, ROCKY_WASTELAND, "Rocky Wasteland", BiomeType.COOL, Type.DRY, Type.WASTELAND, Type.SPARSE);
		initBiome(14, MUSHROOM_GROVE, "Mushroom Grove", BiomeType.WARM, Type.DENSE, Type.MUSHROOM, Type.FOREST);
		initBiome(12, TROPICAL_LAKES, "Tropical Lakes", BiomeType.WARM, Type.HOT, Type.JUNGLE, Type.LUSH);
		initBiome(10, TROPICAL_DESERT, "Tropical Desert", BiomeType.WARM, Type.HOT, Type.LUSH);
		initBiome(9, MEGA_MOUNTAINS, "Mega Mountains", BiomeType.COOL, Type.HILLS, Type.MOUNTAIN, Type.COLD);
	}
	
	private static Biome initBiome(int rarity, Biome biome, String name, BiomeType biomeType, Type... types) {
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered.");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, rarity));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("Biome Added.");
		return biome;
	}
}
