package com.flashfyre.fyrecraft.init;

import com.flashfyre.fyrecraft.enchantments.*;
import com.flashfyre.fyrecraft.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class EnchInit {
	
	public static final Enchantment blaze = new EnchBlaze();
	public static final Enchantment enderport = new EnchEnderport();
	public static final Enchantment ascending = new EnchAscending();
	
	public static final Enchantment vampiric = new EnchVampiric();
	public static final Enchantment wither_aspect = new EnchWitherAspect();
	
	@Mod.EventBusSubscriber(modid = Reference.MODID)
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void onEvent(final RegistryEvent.Register<Enchantment> event)
        {
            // DEBUG
            System.out.println("Registering Enchantments");

            final IForgeRegistry<Enchantment> registry = event.getRegistry();
                        
            registry.register(new EnchBlaze());
            registry.register(new EnchEnderport());
            registry.register(new EnchAscending()); 
            
            registry.register(new EnchVampiric());
            registry.register(new EnchWitherAspect());
        }
    }

}
