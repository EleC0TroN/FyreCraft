package com.flashfyre.fyrecraft;

import com.flashfyre.fyrecraft.proxy.CommonProxy;
import com.flashfyre.fyrecraft.recipes.ModRecipes;
import com.flashfyre.fyrecraft.util.Reference;
import com.flashfyre.fyrecraft.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class FyreCraft {
	
	@Instance
	public static FyreCraft instance;
	
	public static final CreativeTabs fyrecraftblockstab = new BlocksTab("fyrecraftblockstab");
	public static final CreativeTabs fyrecrafttoolstab = new BlocksTab("fyrecrafttoolstab");
	public static final CreativeTabs fyrecraftmaterialstab = new BlocksTab("fyrecraftmaterialstab");
	public static final CreativeTabs fyrecraftcombattab = new BlocksTab("fyrecraftcombattab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)	{
		RegistryHandler.preInitRegistries();
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
		ModRecipes.init();
		RegistryHandler.postInitRegistries();
	}
	
}