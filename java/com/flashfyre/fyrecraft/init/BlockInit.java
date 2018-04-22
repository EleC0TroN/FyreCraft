package com.flashfyre.fyrecraft.init;

import java.util.ArrayList;
import java.util.List;

import com.flashfyre.fyrecraft.objects.blocks.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Material Ores
	public static final Block PHOSPHITE_ORE = new PhosphiteOre("phosphite_ore", Material.ROCK);
	public static final Block PHOSPHITE_ORE_END = new PhosphiteOreEnd("phosphite_ore_end", Material.ROCK);
	public static final Block ICESTONE = new Icestone("icestone", Material.ROCK);
	public static final Block AQUAMARINE_ORE = new AquamarineOre("aquamarine_ore", Material.ROCK);
	public static final Block PRISMARINE_LAPIS_ORE = new PrismarineLapisOre("prismarine_lapis_ore", Material.ROCK);
	public static final Block ENDER_PEARL_ORE = new EnderPearlOre("ender_pearl_ore", Material.ROCK);
	
	//Useful Ores
	public static final Block PUMICE_GOLD_ORE = new PumiceGoldOre("pumice_gold_ore", Material.ROCK);
	public static final Block AZURITE_ORE = new AzuriteOre("azurite_ore", Material.ROCK);
	public static final Block INFERNADIUM_ORE = new InfernadiumOre("infernadium_ore", Material.ROCK);
	public static final Block ATLANTIUM_ORE = new AtlantiumOre("atlantium_ore", Material.ROCK);
	public static final Block VULCANITE_ORE = new VulcaniteOre("vulcanite_ore", Material.ROCK);
	public static final Block BLAZORITE_ORE = new BlazoriteOre("blazorite_ore", Material.ROCK);
	public static final Block CELESTIUM_ORE = new CelestiumOre("celestium_ore", Material.ROCK);
	
	//Ore blocks
	public static final Block AQUAMARINE_BLOCK = new AquamarineBlock("aquamarine_block", Material.ROCK);
	public static final Block INFERNADIUM_BLOCK = new InfernadiumBlock("infernadium_block", Material.IRON);
	public static final Block VULCANITE_BLOCK = new VulcaniteBlock("vulcanite_block", Material.IRON);
	
	//Stone types
	public static final Block PUMICE = new Pumice("pumice", Material.ROCK);
	
	//Decoration Blocks
	public static final Block WITHER_NETHER_BRICK = new WitherNetherBrick("wither_nether_brick", Material.ROCK);
	public static final Block CELESTIUM_ENCHANTMENT_TABLE = new CelestiumEnchantmentTable("celestium_enchantment_table", Material.ROCK);
	
	//Other Blocks
	public static final Block TELEPORTER = new Teleporter("teleporter", Material.ROCK);
	
}
