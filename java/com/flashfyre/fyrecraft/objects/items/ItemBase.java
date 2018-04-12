package com.flashfyre.fyrecraft.objects.items;

import com.flashfyre.fyrecraft.FyreCraft;
import com.flashfyre.fyrecraft.init.ItemInit;
import com.flashfyre.fyrecraft.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FyreCraft.fyrecraftmaterialstab);
		
		ItemInit.ITEMS.add(this);
	}
	
		@Override
		public void registerModels() {			
			FyreCraft.proxy.registerItemRenderer(this, 0, "inventory");		
	}

}
