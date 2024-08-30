package com.minimushroomman.obsidianTools.init;

import java.util.ArrayList;
import java.util.List;

import com.minimushroomman.obsidianTools.item.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item OBSIDIANSTICK = new ItemBase("obsidianStick", CreativeTabs.MATERIALS);
}
