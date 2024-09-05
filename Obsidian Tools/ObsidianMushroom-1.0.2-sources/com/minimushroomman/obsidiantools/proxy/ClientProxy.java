package com.minimushroomman.obsidiantools.proxy;

import com.minimushroomman.obsidiantools.init.ModBlocks;
import com.minimushroomman.obsidiantools.init.ModItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
