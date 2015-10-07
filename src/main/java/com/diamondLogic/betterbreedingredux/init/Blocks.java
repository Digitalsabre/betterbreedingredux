package com.diamondLogic.betterbreedingredux.init;

import com.diamondLogic.betterbreedingredux.Reference;
import com.diamondLogic.betterbreedingredux.blocks.ModBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class Blocks extends net.minecraft.init.Blocks
{
	
	public static Block butcher_table;
	
	public static void init()
	{
		butcher_table = new ModBlock(Material.wood).setUnlocalizedName("butcher_table");
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(butcher_table, butcher_table.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(butcher_table);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
