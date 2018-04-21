package com.flashfyre.fyrecraft.objects.blocks;

import java.util.Random;

import com.flashfyre.fyrecraft.init.ItemInit;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class AzuriteOre extends BlockBase {

	public AzuriteOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.0F);		
		

	} 
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ItemInit.AZURITE;
	}
}
