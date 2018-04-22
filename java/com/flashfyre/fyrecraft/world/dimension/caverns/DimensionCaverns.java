package com.flashfyre.fyrecraft.world.dimension.caverns;

import com.flashfyre.fyrecraft.init.BiomeInit;
import com.flashfyre.fyrecraft.init.DimensionInit;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionCaverns extends WorldProvider {
	
	public DimensionCaverns() {		
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.MINING_CAVERNS);
	}
	
	@Override
	public DimensionType getDimensionType() {
		return DimensionInit.CAVERNS;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorCaverns(world, true, world.getSeed());
	}
	
	 @Override
	 public boolean canRespawnHere() {
		 return false;
	 }
	 
	 @Override
	 public boolean isSurfaceWorld() {
		 return false;
	 }
	 
	 public boolean getHasNoSky() {
		 return true;
	 }

}
