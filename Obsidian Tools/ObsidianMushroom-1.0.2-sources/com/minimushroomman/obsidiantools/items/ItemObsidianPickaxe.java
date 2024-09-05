package com.minimushroomman.obsidiantools.items;

import com.minimushroomman.obsidiantools.Reference;

import net.minecraft.item.ItemPickaxe;

import net.minecraft.item.Item.ToolMaterial;

public class ItemObsidianPickaxe extends ItemPickaxe {

	public ItemObsidianPickaxe(ToolMaterial material) {
		super(material);
		func_77655_b(Reference.ObsidianItems.OBSIDIANPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.ObsidianItems.OBSIDIANPICKAXE.getRegistryName());
	}

}
