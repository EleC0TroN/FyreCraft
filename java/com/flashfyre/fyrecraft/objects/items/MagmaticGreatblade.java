package com.flashfyre.fyrecraft.objects.items;

import com.flashfyre.fyrecraft.objects.tools.ToolSword;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class MagmaticGreatblade extends ToolSword {

	public MagmaticGreatblade(String name, ToolMaterial material) {
		super(name, material);
	}
	
	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase target, EntityLivingBase attacker)
	{
		 par1ItemStack.damageItem(1, attacker);
		 target.setFire(5);
		 return true;
	}
	
}
