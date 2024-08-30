package com.minimushroomman.obsidianTools.init;

import java.util.ArrayList;
import java.util.List;

import com.minimushroomman.obsidianTools.block.BlockBase;
import com.minimushroomman.obsidianTools.block.BlockCompressedObsidian;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCKCOMPRESSEDOBSIDIAN = new BlockCompressedObsidian("blockCompressedObsidian", Material.ROCK, CreativeTabs.BUILDING_BLOCKS);
}
