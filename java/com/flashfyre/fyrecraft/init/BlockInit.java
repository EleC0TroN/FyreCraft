package com.flashfyre.fyrecraft.init;

import java.util.ArrayList;
import java.util.List;

import com.flashfyre.fyrecraft.objects.blocks.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block PHOSPHITE_ORE = new PhosphiteOre("phosphite_ore", Material.ROCK);
	public static final Block PHOSPHITE_ORE_END = new PhosphiteOreEnd("phosphite_ore_end", Material.ROCK);
	public static final Block VULCANITE_ORE = new VulcaniteOre("vulcanite_ore", Material.ROCK);
	public static final Block ICESTONE = new Icestone("icestone", Material.ROCK);
	public static final Block CELESTIUM_ORE = new CelestiumOre("celestium_ore", Material.ROCK);

}
