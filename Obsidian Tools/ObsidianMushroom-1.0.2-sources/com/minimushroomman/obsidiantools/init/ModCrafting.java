package com.minimushroomman.obsidiantools.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void register() {
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianStick, 4), "O","O", 'O', ModBlocks.compressedObsidian);
		GameRegistry.addSmelting(Blocks.field_150343_Z, new ItemStack(ModItems.hardenedObsidian), 1.3F);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.compressedObsidian, 3), "OOO", "OOO", "OOO", 'O', ModItems.hardenedObsidian);
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianSword), "B", "B", "S", 'B', ModBlocks.compressedObsidian, 'S', ModItems.obsidianStick);
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianPickaxe), "BBB", " S ", " S ", 'B', ModBlocks.compressedObsidian, 'S', ModItems.obsidianStick);
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianShovel), "B", "S", "S", 'B', ModBlocks.compressedObsidian, 'S', ModItems.obsidianStick);
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianHoe), "BB", " S", " S", 'B', ModBlocks.compressedObsidian, 'S', ModItems.obsidianStick);
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianWoodAxe), "BB", "BS", " S", 'B', ModBlocks.compressedObsidian, 'S', ModItems.obsidianStick);
	}
}
