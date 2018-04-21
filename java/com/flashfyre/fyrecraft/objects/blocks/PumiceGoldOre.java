package com.flashfyre.fyrecraft.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PumiceGoldOre extends BlockBase {

	public PumiceGoldOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 0);
		setLightLevel(0.0F);
	}

}
