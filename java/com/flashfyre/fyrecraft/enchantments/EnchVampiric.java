package com.flashfyre.fyrecraft.enchantments;

import com.flashfyre.fyrecraft.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchVampiric extends Enchantment {

	public EnchVampiric() {
		super(Rarity.RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[] { EntityEquipmentSlot.MAINHAND });
		setRegistryName(Reference.MODID, "vampiric");
		setName("vampiric");
	}
	
	public void onEntityDamaged(EntityLivingBase user, Entity target, int level) {
		
		user.heal(level);
		user.playSound(SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, 1.0F, 1.0F);
		
	}
	
	  @Override
	    public int getMaxLevel()
	    {
	        return 2;
	    }
}
