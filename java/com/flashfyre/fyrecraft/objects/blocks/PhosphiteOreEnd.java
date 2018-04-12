package com.flashfyre.fyrecraft.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PhosphiteOreEnd extends BlockBase {

	public PhosphiteOreEnd(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(7.0F);

	} 

}
