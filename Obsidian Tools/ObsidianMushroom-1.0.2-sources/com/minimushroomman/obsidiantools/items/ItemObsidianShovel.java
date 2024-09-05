package com.minimushroomman.obsidiantools.items;

import com.minimushroomman.obsidiantools.Reference;

import net.minecraft.item.ItemSpade;;

import net.minecraft.item.Item.ToolMaterial;

public class ItemObsidianShovel extends ItemSpade {

	public ItemObsidianShovel(ToolMaterial material) {
		super(material);
		func_77655_b(Reference.ObsidianItems.OBSIDIANSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.ObsidianItems.OBSIDIANSHOVEL.getRegistryName());
	}

}
