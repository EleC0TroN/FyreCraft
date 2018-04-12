package com.flashfyre.fyrecraft.objects.blocks;

import java.util.Random;

import com.flashfyre.fyrecraft.init.ItemInit;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class CelestiumOre extends BlockBase {

	public CelestiumOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(45.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(3.0F);
		
		

	} 
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ItemInit.CELESTIAL_DIAMOND;
	}

}
