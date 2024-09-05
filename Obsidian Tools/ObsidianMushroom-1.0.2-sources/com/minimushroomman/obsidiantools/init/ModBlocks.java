package com.minimushroomman.obsidiantools.init;

import com.minimushroomman.obsidiantools.blocks.BlockCompressedObsidian;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block compressedObsidian;
	
	public static void init() {
		compressedObsidian = new BlockCompressedObsidian();
	}
	
	public static void register() {
		registerBlock(compressedObsidian);
	}
	
	private static void registerBlock(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(compressedObsidian);
	}
	
	private static void registerRender(Block block){
		Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178086_a(Item.func_150898_a(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}

