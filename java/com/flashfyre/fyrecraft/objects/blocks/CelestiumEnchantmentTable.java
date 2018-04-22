package com.flashfyre.fyrecraft.objects.blocks;

import com.flashfyre.fyrecraft.FyreCraft;
import com.flashfyre.fyrecraft.init.BlockInit;
import com.flashfyre.fyrecraft.init.ItemInit;

import net.minecraft.block.BlockEnchantmentTable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityEnchantmentTable;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CelestiumEnchantmentTable extends BlockEnchantmentTable {
	
	public static final AxisAlignedBB CELESTIUM_ENCHANTMENT_TABLE_AABB = new AxisAlignedBB(0, 0, 0, 1D, 0.75D, 1D);
	
	public CelestiumEnchantmentTable(String name, Material material) {
		
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FyreCraft.fyrecraftblockstab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	
	
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof TileEntityEnchantmentTable)
            {
                playerIn.displayGui((TileEntityEnchantmentTable)tileentity);
            }

            return true;
        }
		
	}
		
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return CELESTIUM_ENCHANTMENT_TABLE_AABB;
	}
		
}
