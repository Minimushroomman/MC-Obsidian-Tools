package com.minimushroomman.obsidiantools.items;

import com.minimushroomman.obsidiantools.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemObsidianChestplate extends ItemArmor{

	public ItemObsidianChestplate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.func_77655_b(Reference.ObsidianItems.OBSIDIANCHESTPLATE.getUnlocalizedName());
		this.setRegistryName(Reference.ObsidianItems.OBSIDIANCHESTPLATE.getUnlocalizedName());
	}
}

