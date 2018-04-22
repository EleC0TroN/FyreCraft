package com.flashfyre.fyrecraft.objects.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class EnderPearlOre extends BlockBase {
	
	public EnderPearlOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0.0F);
		
		

	} 
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.ENDER_PEARL;
	}

}
