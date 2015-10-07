package com.diamondLogic.betterbreedingredux;

import com.diamondLogic.betterbreedingredux.init.Blocks;
import com.diamondLogic.betterbreedingredux.init.Items;
import com.diamondLogic.betterbreedingredux.init.Recipes;
import com.diamondLogic.betterbreedingredux.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class betterBreedingRedux
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		Blocks.init();
		Blocks.register();
    	Items.init();
    	Items.register();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	Recipes.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.registerRenders();
    }
}
