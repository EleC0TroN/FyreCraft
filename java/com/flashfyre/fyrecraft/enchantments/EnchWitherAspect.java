package com.flashfyre.fyrecraft.enchantments;

import com.flashfyre.fyrecraft.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.potion.PotionEffect;

public class EnchWitherAspect extends Enchantment {

    public EnchWitherAspect() {
        super(Rarity.RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[] { EntityEquipmentSlot.MAINHAND });
        setRegistryName(Reference.MODID, "wither_aspect");
        setName("wither_aspect");
    }

    public void onEntityDamaged(EntityLivingBase user, EntityLivingBase target, int level) {

        target.addPotionEffect(new PotionEffect(MobEffects.WITHER, level * 20, level - 1));
    }

    @Override
    public int getMaxLevel()
    {
        return 3;
    }
}
