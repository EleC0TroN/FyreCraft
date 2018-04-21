package com.flashfyre.fyrecraft.world.dimension.waterfalls;

import com.flashfyre.fyrecraft.init.BiomeInit;
import com.flashfyre.fyrecraft.init.DimensionInit;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionWaterfalls extends WorldProvider {
	
	public DimensionWaterfalls() {		
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.WATERFALLS);
	}
	
	@Override
	public DimensionType getDimensionType() {
		return DimensionInit.WATERFALLS;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorWaterfalls(world, true, world.getSeed());
	}
	
	 @Override
	 public boolean canRespawnHere() {
		 return false;
	 }
	 
	 @Override
	 public boolean isSurfaceWorld() {
		 return false;
	 }

}
