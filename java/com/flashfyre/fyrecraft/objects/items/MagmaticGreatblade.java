package com.flashfyre.fyrecraft.objects.items;

import com.flashfyre.fyrecraft.objects.tools.ToolSword;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;

public class MagmaticGreatblade extends ToolSword {

	public MagmaticGreatblade(String name, ToolMaterial material) {
		super(name, material);
	}
	
	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
		 par1ItemStack.damageItem(1, par3EntityLiving);
		 par2EntityLiving.setFire(10);
		 return true;
	}
	
}
