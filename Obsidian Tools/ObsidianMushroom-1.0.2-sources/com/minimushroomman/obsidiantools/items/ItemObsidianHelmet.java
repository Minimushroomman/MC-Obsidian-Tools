package com.minimushroomman.obsidiantools.items;

import com.minimushroomman.obsidiantools.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemObsidianHelmet extends ItemArmor{

	public ItemObsidianHelmet(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.func_77655_b(Reference.ObsidianItems.OBSIDIANHELMET.getUnlocalizedName());
		this.setRegistryName(Reference.ObsidianItems.OBSIDIANHELMET.getRegistryName());
	}

}
