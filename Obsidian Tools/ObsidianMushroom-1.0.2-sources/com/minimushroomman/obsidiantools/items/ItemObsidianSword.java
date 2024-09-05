package com.minimushroomman.obsidiantools.items;

import com.minimushroomman.obsidiantools.Reference;

import net.minecraft.item.ItemSword;

import net.minecraft.item.Item.ToolMaterial;

public class ItemObsidianSword extends ItemSword {

	public ItemObsidianSword(ToolMaterial material) {
		super(material);
		func_77655_b(Reference.ObsidianItems.OBSIDIANSWORD.getUnlocalizedName());
		setRegistryName(Reference.ObsidianItems.OBSIDIANSWORD.getRegistryName());
	}

}
