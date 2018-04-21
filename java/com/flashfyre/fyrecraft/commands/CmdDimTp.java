package com.flashfyre.fyrecraft.commands;


import java.util.List;

import com.flashfyre.fyrecraft.commands.util.Teleport;
import com.flashfyre.fyrecraft.util.Reference;
import com.google.common.collect.Lists;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class CmdDimTp extends CommandBase {

	private final List<String> aliases = Lists.newArrayList(Reference.MOD_ID, "tp", "tpdim", "dimtp", "tpdimension", "dimensiontp", "teleportdimension", "dimensionteleport", "teleport");
	
	@Override
	public String getName() {
		return "dimensiontp";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "dimensiontp <id>";
	}
	
	@Override
	public List<String> getAliases() {
		return aliases;
	}
	
	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
		return true;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		if(args.length < 1) return;
		
		String s = args[0];
		int dimensionID;
		
		try 
		{
			dimensionID = Integer.parseInt(s);
		}catch(NumberFormatException e) {
			sender.sendMessage(new TextComponentString(TextFormatting.RED + "Dimension ID Invalid."));
			return;
		}
		
		if(sender instanceof EntityPlayer) {
			Teleport.teleportToDimension((EntityPlayer)sender, dimensionID, sender.getPosition().getX(), sender.getPosition().getY(), sender.getPosition().getZ());

		}
		
	}

}
