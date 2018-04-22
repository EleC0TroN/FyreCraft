package com.flashfyre.fyrecraft.init;

import java.util.ArrayList;
import java.util.List;

import com.flashfyre.fyrecraft.objects.armour.ArmourBase;
import com.flashfyre.fyrecraft.objects.items.*;
import com.flashfyre.fyrecraft.objects.tools.*;
import com.flashfyre.fyrecraft.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//public static final ToolMaterial TOOL_TEST = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
	//public static final ArmorMaterial ARMOUR_TEST = EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness)

	//Material (for tools & armour)
	public static final ToolMaterial TOOL_AZURITE = EnumHelper.addToolMaterial("tool_azurite", 2, 750, 7.0F, 2.5F, 22);
	public static final ArmorMaterial ARMOUR_AZURITE = EnumHelper.addArmorMaterial("armor_azurite", Reference.MODID + ":azurite", 42, new int[]{2, 5, 6, 2}, 22, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
	
	public static final ToolMaterial TOOL_INFERNADIUM = EnumHelper.addToolMaterial("tool_infernadium", 4, 2500, 10.0F, 4.0F, 16);
	public static final ArmorMaterial ARMOUR_INFERNADIUM = EnumHelper.addArmorMaterial("armor_infernadium", Reference.MODID + ":infernadium", 42, new int[]{4, 7, 9, 4}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.5F);
	
	public static final ToolMaterial TOOL_ATLANTIUM = EnumHelper.addToolMaterial("tool_atlantium", 4, 2900, 12.0F, 4.5F, 18);
	public static final ArmorMaterial ARMOUR_ATLANTIUM = EnumHelper.addArmorMaterial("armor_atlantium", Reference.MODID + ":atlantium", 48, new int[] {4, 7, 9, 4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	
	public static final ToolMaterial TOOL_VULCANITE = EnumHelper.addToolMaterial("tool_vulcanite", 5, 3700, 14.0F, 5.0F, 10);
	public static final ArmorMaterial ARMOUR_VULCANITE = EnumHelper.addArmorMaterial("armor_vulcanite", Reference.MODID + ":vulcanite", 55, new int[] {5, 8, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.5F);
	
	public static final ToolMaterial TOOL_MAGMATIC_GREATBLADE = EnumHelper.addToolMaterial("magmatic_greatblade", 5, 4000, 14.0F, 5.0F, 8);
	
	//Items
	public static final Item PHOSPHITE = new ItemBase("phosphite");
	public static final Item AQUAMARINE = new ItemBase("aquamarine");
	public static final Item AZURITE = new ItemBase("azurite");
	public static final Item INFERNADIUM_INGOT = new ItemBase("infernadium_ingot");
	public static final Item ATLANTIUM_INGOT = new ItemBase("atlantium_ingot");
	public static final Item VULCANITE_INGOT = new ItemBase("vulcanite_ingot");
	public static final Item BLAZORITE_INGOT = new ItemBase("blazorite_ingot");
	public static final Item CELESTIAL_DIAMOND = new ItemBase("celestial_diamond");
	
	//Tools
	public static final Item AZURITE_SWORD = new ToolSword("azurite_sword", TOOL_AZURITE);
	public static final Item AZURITE_AXE = new ToolAxe("azurite_axe", TOOL_AZURITE);
	public static final Item AZURITE_PICKAXE = new ToolPickaxe("azurite_pickaxe", TOOL_AZURITE);
	public static final Item AZURITE_SHOVEL = new ToolShovel("azurite_shovel", TOOL_AZURITE);
	public static final Item AZURITE_HOE = new ToolHoe("azurite_hoe", TOOL_AZURITE);
	
	public static final Item INFERNADIUM_SWORD = new ToolSword("infernadium_sword", TOOL_INFERNADIUM);
	public static final Item INFERNADIUM_AXE = new ToolAxe("infernadium_axe", TOOL_INFERNADIUM);
	public static final Item INFERNADIUM_PICKAXE = new ToolPickaxe("infernadium_pickaxe", TOOL_INFERNADIUM);
	public static final Item INFERNADIUM_SHOVEL = new ToolShovel("infernadium_shovel", TOOL_INFERNADIUM);
	public static final Item INFERNADIUM_HOE = new ToolHoe("infernadium_hoe", TOOL_INFERNADIUM);
	
	public static final Item ATLANTIUM_SWORD = new ToolSword("atlantium_sword", TOOL_ATLANTIUM);
	public static final Item ATLANTIUM_AXE = new ToolAxe("atlantium_axe", TOOL_ATLANTIUM);
	public static final Item ATLANTIUM_PICKAXE = new ToolPickaxe("atlantium_pickaxe", TOOL_ATLANTIUM);
	public static final Item ATLANTIUM_SHOVEL = new ToolShovel("atlantium_shovel", TOOL_ATLANTIUM);
	public static final Item ATLANTIUM_HOE = new ToolHoe("atlantium_hoe", TOOL_ATLANTIUM);
	
	public static final Item VULCANITE_SWORD = new ToolSword("vulcanite_sword", TOOL_VULCANITE);
	public static final Item VULCANITE_AXE = new ToolAxe("vulcanite_axe", TOOL_VULCANITE);
	public static final Item VULCANITE_PICKAXE = new ToolPickaxe("vulcanite_pickaxe", TOOL_VULCANITE);
	public static final Item VULCANITE_SHOVEL = new ToolShovel("vulcanite_shovel", TOOL_VULCANITE);
	public static final Item VULCANITE_HOE = new ToolHoe("vulcanite_hoe", TOOL_VULCANITE);
	
	public static final Item MAGMATIC_GREATBLADE = new MagmaticGreatblade("magmatic_greatblade", TOOL_MAGMATIC_GREATBLADE);
	
	//Armour
	public static final Item AZURITE_HELMET = new ArmourBase("azurite_helmet", ARMOUR_AZURITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item AZURITE_CHESTPLATE = new ArmourBase("azurite_chestplate", ARMOUR_AZURITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item AZURITE_LEGGINGS = new ArmourBase("azurite_leggings", ARMOUR_AZURITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item AZURITE_BOOTS = new ArmourBase("azurite_boots", ARMOUR_AZURITE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item INFERNADIUM_HELMET = new ArmourBase("infernadium_helmet", ARMOUR_INFERNADIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item INFERNADIUM_CHESTPLATE = new ArmourBase("infernadium_chestplate", ARMOUR_INFERNADIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item INFERNADIUM_LEGGINGS = new ArmourBase("infernadium_leggings", ARMOUR_INFERNADIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item INFERNADIUM_BOOTS = new ArmourBase("infernadium_boots", ARMOUR_INFERNADIUM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ATLANTIUM_HELMET = new ArmourBase("atlantium_helmet", ARMOUR_ATLANTIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item ATLANTIUM_CHESTPLATE = new ArmourBase("atlantium_chestplate", ARMOUR_ATLANTIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item ATLANTIUM_LEGGINGS = new ArmourBase("atlantium_leggings", ARMOUR_ATLANTIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item ATLANTIUM_BOOTS = new ArmourBase("atlantium_boots", ARMOUR_ATLANTIUM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item VULCANITE_HELMET = new ArmourBase("vulcanite_helmet", ARMOUR_VULCANITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item VULCANITE_CHESTPLATE = new ArmourBase("vulcanite_chestplate", ARMOUR_VULCANITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item VULCANITE_LEGGINGS = new ArmourBase("vulcanite_leggings", ARMOUR_VULCANITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item VULCANITE_BOOTS = new ArmourBase("vulcanite_boots", ARMOUR_VULCANITE, 1, EntityEquipmentSlot.FEET);

}
