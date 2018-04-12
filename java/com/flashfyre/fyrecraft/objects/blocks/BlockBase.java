package com.flashfyre.fyrecraft.objects.blocks;

import com.flashfyre.fyrecraft.FyreCraft;
import com.flashfyre.fyrecraft.init.BlockInit;
import com.flashfyre.fyrecraft.init.ItemInit;
import com.flashfyre.fyrecraft.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	
	public BlockBase(String name, Material material) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FyreCraft.fyrecraftblockstab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		
		FyreCraft.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
