package com.flashfyre.fyrecraft.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AquamarineBlock extends BlockBase {

	public AquamarineBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(0.8F);
		setResistance(4.0F);
		setHarvestLevel("pickaxe", 0);
		setLightLevel(0.0F);

	}

}
