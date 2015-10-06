package com.diamondLogic.betterbreedingredux.proxy;

import com.diamondLogic.betterbreedingredux.init.Blocks;
import com.diamondLogic.betterbreedingredux.init.Items;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
		Items.registerRenders();
		Blocks.registerRenders();
	}
}
