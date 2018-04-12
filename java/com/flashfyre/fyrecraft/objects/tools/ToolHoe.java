package com.flashfyre.fyrecraft.objects.tools;

import com.flashfyre.fyrecraft.FyreCraft;
import com.flashfyre.fyrecraft.init.ItemInit;
import com.flashfyre.fyrecraft.util.IHasModel;

import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel{

	public ToolHoe(String name, ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FyreCraft.fyrecrafttoolstab);
		
		ItemInit.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {		
		FyreCraft.proxy.registerItemRenderer(this, 0, "inventory");		
	}

}
