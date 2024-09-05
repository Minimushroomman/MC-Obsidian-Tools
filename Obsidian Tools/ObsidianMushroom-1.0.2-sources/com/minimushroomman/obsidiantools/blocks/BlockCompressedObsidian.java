package com.minimushroomman.obsidiantools.blocks;

import com.minimushroomman.obsidiantools.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCompressedObsidian extends Block {

	public BlockCompressedObsidian() {
		super(Material.field_151576_e);
		this.func_149647_a(CreativeTabs.field_78030_b);
		this.func_149711_c(50.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.func_149752_b(5000.0F);
		func_149663_c(Reference.ObsidianBlocks.COMPRESSEDOBSIDIAN.getUnlocalizedName());
		setRegistryName(Reference.ObsidianBlocks.COMPRESSEDOBSIDIAN.getRegistryName());
	}

}
