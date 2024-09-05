package com.minimushroomman.obsidiantools.items;

import com.minimushroomman.obsidiantools.Reference;

import net.minecraft.item.Item;

import net.minecraft.item.Item.ToolMaterial;

public class ItemObsidianWoodAxe extends ItemAxeCustom{
	
	public ItemObsidianWoodAxe(ToolMaterial material) {
		super(material);
		func_77655_b(Reference.ObsidianItems.OBSIDIANWOODAXE.getUnlocalizedName());
		setRegistryName(Reference.ObsidianItems.OBSIDIANWOODAXE.getRegistryName());
	}
}
