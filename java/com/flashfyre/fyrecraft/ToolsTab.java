package com.flashfyre.fyrecraft;

import com.flashfyre.fyrecraft.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ToolsTab extends CreativeTabs {

	public ToolsTab(String label) {
		super("fyrecrafttoolstab");		
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.INFERNADIUM_PICKAXE);
	}

}
