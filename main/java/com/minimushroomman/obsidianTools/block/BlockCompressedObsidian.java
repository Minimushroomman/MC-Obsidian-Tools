package com.minimushroomman.obsidianTools.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCompressedObsidian extends BlockBase{

	public BlockCompressedObsidian(String name, Material material, CreativeTabs tab) {
		super(name, material, tab);
		this.setHarvestLevel("pickaxe", 3);
		this.setHardness(50.0F);
		this.setResistance(6000.0F);
	}

}
