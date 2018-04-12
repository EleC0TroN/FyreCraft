package com.flashfyre.fyrecraft.util.handlers;

import com.flashfyre.fyrecraft.init.BiomeInit;
import com.flashfyre.fyrecraft.init.BlockInit;
import com.flashfyre.fyrecraft.init.ItemInit;
import com.flashfyre.fyrecraft.util.IHasModel;
import com.flashfyre.fyrecraft.world.gen.OregenPhosphite;
import com.flashfyre.fyrecraft.world.gen.OregenPhosphiteEnd;
import com.flashfyre.fyrecraft.world.types.WorldTypeCustom;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.flashfyre.fyrecraft.world.gen.*;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		
		for(Item item : ItemInit.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS) {
			if(block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries() {
		GameRegistry.registerWorldGenerator(new OregenPhosphite(), 0);
		GameRegistry.registerWorldGenerator(new OregenPhosphiteEnd(), 0);
		GameRegistry.registerWorldGenerator(new OregenVulcanite(), 0);
		GameRegistry.registerWorldGenerator(new OregenIcestone(), 0);
		GameRegistry.registerWorldGenerator(new OregenCelestium(), 0);
		
		BiomeInit.registerBiomes();
	}
	
	public static void postInitRegistries() {
		
		WorldType CUSTOM = new WorldTypeCustom();
	}
}
