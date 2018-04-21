package com.flashfyre.fyrecraft.recipes;

import com.flashfyre.fyrecraft.init.BlockInit;
import com.flashfyre.fyrecraft.init.ItemInit;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		
		//Smelting
		GameRegistry.addSmelting(BlockInit.INFERNADIUM_ORE, new ItemStack(ItemInit.INFERNADIUM_INGOT), 1.5F);
		GameRegistry.addSmelting(BlockInit.ATLANTIUM_ORE, new ItemStack(ItemInit.ATLANTIUM_INGOT), 1.7F);
		GameRegistry.addSmelting(BlockInit.VULCANITE_ORE, new ItemStack(ItemInit.VULCANITE_INGOT), 2.0F);
		GameRegistry.addSmelting(BlockInit.BLAZORITE_ORE, new ItemStack(ItemInit.BLAZORITE_INGOT), 2.5F);
		GameRegistry.addSmelting(BlockInit.PUMICE_GOLD_ORE, new ItemStack(Items.GOLD_INGOT), 1.0F);
		
		//Crafting
		
	}

}
