package com.flashfyre.fyrecraft.enchantments;

import com.flashfyre.fyrecraft.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchBlaze extends Enchantment {

	public EnchBlaze() {
		super(Rarity.RARE, EnumEnchantmentType.ARMOR, new EntityEquipmentSlot[] { EntityEquipmentSlot.HEAD, EntityEquipmentSlot.CHEST, EntityEquipmentSlot.LEGS, EntityEquipmentSlot.FEET });
		setRegistryName(Reference.MODID, "blaze");
		setName("blaze");
	}
	
	public void onUserHurt(EntityLivingBase user, Entity attacker, int level) {
		
		attacker.setFire(level * 3);
	}
	
	  @Override
	    public int getMaxLevel()
	    {
	        return 3;
	    }
}
