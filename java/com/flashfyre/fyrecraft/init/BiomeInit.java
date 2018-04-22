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
	
	//Overworld biomes
	public static final Biome ROCKY_WASTELAND = new RockyWasteland();	
	public static final Biome MUSHROOM_GROVE = new MushroomGrove();
	public static final Biome TROPICAL_LAKES = new TropicalLakes();
	public static final Biome MEGA_MOUNTAINS = new MegaMountains();
	public static final Biome RED_DESERT = new RedDesert();
	public static final Biome RED_DESERT_HILLS = new RedDesertHills();
	public static final Biome VOLCANIC_WASTELAND = new VolcanicWasteland();
	public static final Biome CRIMSON_GROVE = new CrimsonGrove();
	
	//Custom dimension biomes
	public static final Biome MINING_CAVERNS = new Caverns();
	public static final Biome WATERFALLS = new Waterfalls();
	
	public static void registerBiomes() {
		
		//initBiome(weight, name, name, biome type, biomedict type);
		
		//Overworld biomes
		initBiome(9, ROCKY_WASTELAND, "Rocky Wasteland", BiomeType.COOL, Type.DRY, Type.WASTELAND, Type.SPARSE);
		initBiome(12, MUSHROOM_GROVE, "Mushroom Grove", BiomeType.WARM, Type.DENSE, Type.MUSHROOM, Type.FOREST);
		initBiome(12, TROPICAL_LAKES, "Tropical Lakes", BiomeType.WARM, Type.HOT, Type.JUNGLE, Type.LUSH);
		initBiome(9, MEGA_MOUNTAINS, "Mega Mountains", BiomeType.COOL, Type.HILLS, Type.MOUNTAIN, Type.COLD);
		initBiome(13, RED_DESERT, "Red Desert", BiomeType.DESERT, Type.DRY, Type.HOT, Type.SANDY);
		initBiome(11, RED_DESERT_HILLS, "Red Desert Hills", BiomeType.DESERT, Type.DRY, Type.HOT, Type.SANDY, Type.HILLS);
		initBiome(10, VOLCANIC_WASTELAND, "Volcanic Wasteland", BiomeType.DESERT, Type.DEAD, Type.DRY, Type.HOT, Type.WASTELAND);
		initBiome(10, CRIMSON_GROVE, "Crimson Grove", BiomeType.WARM, Type.FOREST, Type.DENSE);
		
		//Custom dimension biomes
		initBiome(0, MINING_CAVERNS, "Miner's Caverns", BiomeType.COOL, Type.SPOOKY);
		initBiome(0, WATERFALLS, "Waterfalls", BiomeType.COOL, Type.WATER, Type.WET);
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
