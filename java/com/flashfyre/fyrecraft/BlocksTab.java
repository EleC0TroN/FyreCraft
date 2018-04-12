package com.flashfyre.fyrecraft;

import com.flashfyre.fyrecraft.init.BlockInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlocksTab extends CreativeTabs {

	public BlocksTab(String label) {
		super("fyrecraftblockstab");		
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(BlockInit.PHOSPHITE_ORE));
	}

}
