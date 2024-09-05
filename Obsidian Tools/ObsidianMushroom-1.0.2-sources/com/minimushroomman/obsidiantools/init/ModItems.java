package com.minimushroomman.obsidiantools.init;

import com.minimushroomman.obsidiantools.items.ItemArmorCustom;
import com.minimushroomman.obsidiantools.items.ItemHardenedObsidian;
import com.minimushroomman.obsidiantools.items.ItemObsidianBoots;
import com.minimushroomman.obsidiantools.items.ItemObsidianChestplate;
import com.minimushroomman.obsidiantools.items.ItemObsidianHelmet;
import com.minimushroomman.obsidiantools.items.ItemObsidianPickaxe;
import com.minimushroomman.obsidiantools.items.ItemObsidianShovel;
import com.minimushroomman.obsidiantools.items.ItemObsidianStick;
import com.minimushroomman.obsidiantools.items.ItemObsidianSword;
import com.minimushroomman.obsidiantools.items.ItemObsidianWoodAxe;
import com.minimushroomman.obsidiantools.items.ItemObsidianHoe;
import com.minimushroomman.obsidiantools.items.ItemObsidianLeggings;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//new tier of tools
	public static ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("OBSIDIAN", 3, 3300, 10.0F, 6.0F, 15);
	
	//new armor
	public static ArmorMaterial OBSIDIANA = EnumHelper.addArmorMaterial("OBSIDIANA", "obsidianmushroom:armor/armor", 40, new int[]{3, 8, 6, 3}, 30, SoundEvents.field_187716_o, 4.0F);
	
	//Declaring all the items
	public static ItemSword obsidianSword;
	public static Item obsidianStick;
	public static Item hardenedObsidian;
	public static Item obsidianPickaxe;
	public static Item obsidianShovel;
	public static Item obsidianHoe;
	public static Item obsidianWoodAxe;
	public static ItemArmor obsidianChestplate;
	public static ItemArmor obsidianHelmet;
	public static ItemArmor obsidianLeggings;
	public static ItemArmor obsidianBoots;
	
	public static void init() {
		obsidianStick = new ItemObsidianStick();
		hardenedObsidian = new ItemHardenedObsidian();
		obsidianSword = new ItemObsidianSword(OBSIDIAN);
		obsidianPickaxe = new ItemObsidianPickaxe(OBSIDIAN);
		obsidianShovel = new ItemObsidianShovel(OBSIDIAN);
		obsidianHoe = new ItemObsidianHoe(OBSIDIAN);
		obsidianWoodAxe = new ItemObsidianWoodAxe(OBSIDIAN);
		obsidianChestplate = new ItemObsidianChestplate(OBSIDIANA, 4, EntityEquipmentSlot.CHEST);
		obsidianHelmet = new ItemObsidianHelmet(OBSIDIANA, 4, EntityEquipmentSlot.HEAD);
		obsidianLeggings = new ItemObsidianLeggings(OBSIDIANA, 4, EntityEquipmentSlot.LEGS);
		obsidianBoots =  new ItemObsidianBoots(OBSIDIANA, 4, EntityEquipmentSlot.FEET);
	}
	
	public static void register() {
		GameRegistry.register(obsidianStick);
		GameRegistry.register(hardenedObsidian);
		GameRegistry.register(obsidianSword);
		GameRegistry.register(obsidianPickaxe);
		GameRegistry.register(obsidianShovel);
		GameRegistry.register(obsidianHoe);
		GameRegistry.register(obsidianWoodAxe);
		GameRegistry.register(obsidianChestplate);
		GameRegistry.register(obsidianHelmet);
		GameRegistry.register(obsidianLeggings);
		GameRegistry.register(obsidianBoots);
	}
	
	public static void registerRenders() {
		registerRender(obsidianStick);
		registerRender(hardenedObsidian);
		registerRender(obsidianSword);
		registerRender(obsidianPickaxe);
		registerRender(obsidianShovel);
		registerRender(obsidianHoe);
		registerRender(obsidianWoodAxe);
		registerRender(obsidianChestplate);
		registerRender(obsidianHelmet);
		registerRender(obsidianLeggings);
		registerRender(obsidianBoots);
	}
	
	private static void registerRender(Item item){
		Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178086_a(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
