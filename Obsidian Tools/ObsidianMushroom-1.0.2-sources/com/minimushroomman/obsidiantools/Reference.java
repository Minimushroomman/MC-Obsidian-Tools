package com.minimushroomman.obsidiantools;

public class Reference {
	
	public static final String MOD_ID = "ObsidianMushroom";
	public static final String NAME = "Obsidian Tools";
	public static final String VERSION = "1.0.2";
	public static final String MINECRAFT_VERSION = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.minimushroomman.obsidiantools.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.minimushroomman.obsidiantools.proxy.ServerProxy";
	
	public static enum ObsidianItems {
		OBSIDIANSTICK("obsidianStick", "ItemObsidianStick"),
		HARDENEDOBSIDIAN("hardenedObsidian", "ItemHardenedObsidian"),
		OBSIDIANSWORD("obsidianSword", "ItemObsidianSword"),
		OBSIDIANPICKAXE("obsidianPickaxe", "ItemObsidianPickaxe"),
		OBSIDIANSHOVEL("obsidianShovel", "ItemObsidianShovel"),
		OBSIDIANHOE("obsidianHoe", "ItemObsidianHoe"),
		OBSIDIANWOODAXE("obsidianWoodAxe", "ItemObsidianWoodAxe"),
		OBSIDIANCHESTPLATE("obsidianChestplate", "ItemObsidianChestplate"),
		OBSIDIANHELMET("obsidianHelmet", "ItemObsidianHelmet"),
		OBSIDIANBOOTS("obsidianBoots", "ItemObsidianBoots"),
		OBSIDIANLEGGINGS("obsidianLeggings", "ItemObsidianLeggings");
		
		private String unlocalizedName;
		private String registryName;
		
		ObsidianItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
	
	public static enum ObsidianBlocks {
		
		COMPRESSEDOBSIDIAN("compressedObsidian", "BlockCompressedObsidian");
		
		private String unlocalizedName;
		private String registryName;
		
		ObsidianBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
}
