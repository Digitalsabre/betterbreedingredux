package com.diamondLogic.betterbreedingredux.init;

import com.diamondLogic.betterbreedingredux.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Items
{
	public static Item pig_carcass;
	public static Item butcher_block;
	
	public static void init()
	{
		pig_carcass = new Item().setUnlocalizedName("pig_carcass");
		butcher_block = new Item().setUnlocalizedName("butcher_block");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(pig_carcass, pig_carcass.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(butcher_block, butcher_block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(pig_carcass);
		registerRender(butcher_block);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
