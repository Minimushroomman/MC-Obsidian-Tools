package com.minimushroomman.obsidianTools.item;

import com.minimushroomman.obsidianTools.Main;
import com.minimushroomman.obsidianTools.init.ModItems;
import com.minimushroomman.obsidianTools.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	public ItemBase(String name, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
