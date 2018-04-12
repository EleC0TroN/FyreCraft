package com.flashfyre.fyrecraft;

import com.flashfyre.fyrecraft.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MaterialsTab extends CreativeTabs {

	public MaterialsTab(String label) {
		super("fyrecraftmaterialstab");		
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.CELESTIAL_DIAMOND);
	}

}
