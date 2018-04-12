package com.flashfyre.fyrecraft;

import com.flashfyre.fyrecraft.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CombatTab extends CreativeTabs {

	public CombatTab(String label) {
		super("fyrecraftcombattab");		
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.VULCANITE_HELMET);
	}

}
