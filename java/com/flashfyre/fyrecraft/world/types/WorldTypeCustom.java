package com.flashfyre.fyrecraft.world.types;

import com.flashfyre.fyrecraft.init.BiomeInit;
import com.flashfyre.fyrecraft.world.biome.provider.BiomeProviderMultiple;
import com.flashfyre.fyrecraft.world.types.layer.GenLayerCustom;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.layer.GenLayer;

public class WorldTypeCustom extends WorldType {
	
	public WorldTypeCustom() {
		super("Custom");
	}
	
	@Override
	public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer, ChunkGeneratorSettings chunkSettings) {
		
		return new GenLayerCustom(worldSeed, parentLayer, this, chunkSettings);
	}
	
	@Override
    public BiomeProvider getBiomeProvider(World world) 
    {
        BiomeProvider provider = new BiomeProviderMultiple(BiomeInit.VOLCANIC_WASTELAND, BiomeInit.CRIMSON_GROVE, BiomeInit.MEGA_MOUNTAINS);
        return provider;
    }

}