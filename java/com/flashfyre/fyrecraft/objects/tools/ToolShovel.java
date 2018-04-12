package com.flashfyre.fyrecraft.objects.tools;

import com.flashfyre.fyrecraft.FyreCraft;
import com.flashfyre.fyrecraft.init.ItemInit;
import com.flashfyre.fyrecraft.util.IHasModel;

import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel {
	public ToolShovel(String name, ToolMaterial material) {
		
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
