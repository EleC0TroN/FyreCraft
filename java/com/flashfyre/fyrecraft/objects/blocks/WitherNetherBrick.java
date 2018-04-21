package com.flashfyre.fyrecraft.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WitherNetherBrick extends BlockBase {

	public WitherNetherBrick(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 0);

	}

}
