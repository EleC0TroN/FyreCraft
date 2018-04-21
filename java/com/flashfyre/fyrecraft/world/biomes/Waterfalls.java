package com.flashfyre.fyrecraft.world.biomes;

import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.world.biome.Biome;

public class Waterfalls extends Biome {

	public Waterfalls() {
		super(new BiomeProperties("Waterfalls"));
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityGuardian.class, 10, 3, 7));
	}

}
