package com.flashfyre.fyrecraft.enchantments;

import java.util.Random;

import com.flashfyre.fyrecraft.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchEnderport extends Enchantment {

	public EnchEnderport() {
		super(Rarity.RARE, EnumEnchantmentType.ARMOR, new EntityEquipmentSlot[] { EntityEquipmentSlot.HEAD, EntityEquipmentSlot.CHEST, EntityEquipmentSlot.LEGS, EntityEquipmentSlot.FEET });
		setRegistryName(Reference.MODID, "enderport");
		setName("enderport");
	}
	
	public void onUserHurt(EntityLivingBase user, Entity attacker, int level) {
		Random r = new Random();
		int x = r.nextInt(11) - 5;
		int z = r.nextInt(11) - 5;
		user.attemptTeleport(user.posX + x, user.posY, user.posZ + z);
		user.playSound(SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, 1.0F, 1.0F);
		
	}
	
	  @Override
	    public int getMaxLevel()
	    {
	        return 1;
	    }
}
