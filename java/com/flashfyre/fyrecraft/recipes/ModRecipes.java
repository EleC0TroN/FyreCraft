package com.flashfyre.fyrecraft.recipes;

import com.flashfyre.fyrecraft.init.BlockInit;
import com.flashfyre.fyrecraft.init.ItemInit;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(BlockInit.VULCANITE_ORE, new ItemStack(ItemInit.VULCANITE_INGOT), 1.5F);
	}

}
