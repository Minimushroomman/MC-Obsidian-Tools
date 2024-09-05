package com.minimushroomman.obsidiantools.items;

import com.minimushroomman.obsidiantools.Reference;

import net.minecraft.item.ItemHoe;

import net.minecraft.item.Item.ToolMaterial;

public class ItemObsidianHoe extends ItemHoe {

	public ItemObsidianHoe(ToolMaterial material) {
		super(material);
		func_77655_b(Reference.ObsidianItems.OBSIDIANHOE.getUnlocalizedName());
		setRegistryName(Reference.ObsidianItems.OBSIDIANHOE.getRegistryName());
	}

}
