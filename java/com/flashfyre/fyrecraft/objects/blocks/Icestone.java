package com.flashfyre.fyrecraft.objects.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class Icestone extends BlockBase {

	public Icestone(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.GLASS);
		setHardness(2.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 0);
		setLightLevel(0.0F);

	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(Blocks.ICE);
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return rand.nextInt(2)+3;
	}

}
