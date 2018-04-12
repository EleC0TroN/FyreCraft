package com.flashfyre.fyrecraft.objects.tools;

import com.flashfyre.fyrecraft.FyreCraft;
import com.flashfyre.fyrecraft.init.ItemInit;
import com.flashfyre.fyrecraft.util.IHasModel;

import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {
	public ToolSword(String name, ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FyreCraft.fyrecraftcombattab);
		
		ItemInit.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {		
		FyreCraft.proxy.registerItemRenderer(this, 0, "inventory");		
	}

}
