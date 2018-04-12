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
	
	//Material
	public static final ToolMaterial TOOL_VULCANITE = EnumHelper.addToolMaterial("tool_vulcanite", 4, 2500, 10.0F, 4.0F, 12);
	public static final ArmorMaterial ARMOUR_VULCANITE = EnumHelper.addArmorMaterial("armor_vulcanite", Reference.MOD_ID + ":vulcanite", 40, new int[]{4, 7, 9, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	
	//Items
	public static final Item PHOSPHITE = new ItemBase("phosphite");	
	public static final Item VULCANITE_INGOT = new ItemBase("vulcanite_ingot");
	public static final Item CELESTIAL_DIAMOND = new ItemBase("celestial_diamond");
	
	//Tools
	public static final Item VULCANITE_SWORD = new ToolSword("vulcanite_sword", TOOL_VULCANITE);
	public static final Item VULCANITE_AXE = new ToolAxe("vulcanite_axe", TOOL_VULCANITE);
	public static final Item VULCANITE_PICKAXE = new ToolPickaxe("vulcanite_pickaxe", TOOL_VULCANITE);
	public static final Item VULCANITE_SHOVEL = new ToolShovel("vulcanite_shovel", TOOL_VULCANITE);
	public static final Item VULCANITE_HOE = new ToolHoe("vulcanite_hoe", TOOL_VULCANITE);
	
	//Armour
	public static final Item VULCANITE_HELMET = new ArmourBase("vulcanite_helmet", ARMOUR_VULCANITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item VULCANITE_CHESTPLATE = new ArmourBase("vulcanite_chestplate", ARMOUR_VULCANITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item VULCANITE_LEGGINGS = new ArmourBase("vulcanite_leggings", ARMOUR_VULCANITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item VULCANITE_BOOTS = new ArmourBase("vulcanite_boots", ARMOUR_VULCANITE, 1, EntityEquipmentSlot.FEET);

}
