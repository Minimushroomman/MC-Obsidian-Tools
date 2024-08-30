package com.minimushroomman.obsidianTools.block;

import com.minimushroomman.obsidianTools.Main;
import com.minimushroomman.obsidianTools.init.ModBlocks;
import com.minimushroomman.obsidianTools.init.ModItems;
import com.minimushroomman.obsidianTools.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{


	public BlockBase(String name, Material material, CreativeTabs tab) {
		super(material);
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(tab);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	

}
