package com.flashfyre.fyrecraft.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VulcaniteOre extends BlockBase {

	public VulcaniteOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(0.0F);

	} 

}
