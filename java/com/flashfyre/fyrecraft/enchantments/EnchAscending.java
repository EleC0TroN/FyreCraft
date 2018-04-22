package com.flashfyre.fyrecraft.enchantments;

import com.flashfyre.fyrecraft.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.potion.PotionEffect;

public class EnchAscending extends Enchantment {

	public EnchAscending() {
		super(Rarity.UNCOMMON, EnumEnchantmentType.ARMOR_FEET, new EntityEquipmentSlot[] { EntityEquipmentSlot.FEET });
		setRegistryName(Reference.MODID, "ascending");
		setName("ascending");
	}
	
	public void onUserHurt(EntityLivingBase user, Entity attacker, int level) {
		
		if ((Math.random() * 100) <= 25) {
			user.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 60, 0));
		}
	}

	  @Override
	    public int getMaxLevel()
	    {
	        return 1;
	    }
}