package com.minimushroomman.obsidiantools.items;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import net.minecraft.item.Item.ToolMaterial;

/**
 * This is an implementation of the ItemAxe. This class was created
 * due to a bug in ItemAxe that results in an "Array out of Bound"
 * exception in the constructor. 
 */
public class ItemAxeCustom extends ItemTool {
	// A holder object for the tool material
	private ToolMaterial material = null;
	// This is a list of 
	private static Set<Block> blocks = null;
	
	/**
	 * This initializes the ItemAxeCustom object.
	 * @param ToolMaterial material
	 */
	public ItemAxeCustom(ToolMaterial material) {
		super(material, getEffectedBlocks());
		this.material = material;
	}

	/**
	 * This create a list of vanilla blocks that the custom
	 * axe can be used on.
	 * @return Set<Block>
	 */
	private static Set<Block> getEffectedBlocks() {
		
		if(blocks == null) {
			blocks = new HashSet<Block>();
			// Acacia
			blocks.add(Blocks.field_180410_as);
			blocks.add(Blocks.field_180405_aT);
			blocks.add(Blocks.field_180387_bt);
			blocks.add(Blocks.field_150400_ck);
			// Birch
			blocks.add(Blocks.field_180412_aq);
			blocks.add(Blocks.field_180404_aQ);
			blocks.add(Blocks.field_180392_bq);
			blocks.add(Blocks.field_150487_bG);
			// Dark Oak
			blocks.add(Blocks.field_180409_at);
			blocks.add(Blocks.field_180406_aS);
			blocks.add(Blocks.field_180385_bs);
			blocks.add(Blocks.field_150401_cl);
			// Jungle
			blocks.add(Blocks.field_180411_ar);
			blocks.add(Blocks.field_180403_aR);
			blocks.add(Blocks.field_180386_br);
			blocks.add(Blocks.field_150481_bH);
			// Oak 
			blocks.add(Blocks.field_180413_ao);
			blocks.add(Blocks.field_180407_aO);
			blocks.add(Blocks.field_180390_bo);
			blocks.add(Blocks.field_150476_ad);
			// Spruce
			blocks.add(Blocks.field_180414_ap);
			blocks.add(Blocks.field_180408_aP);
			blocks.add(Blocks.field_180391_bp);
			blocks.add(Blocks.field_150485_bF);
			// Logs
			blocks.add(Blocks.field_150364_r);
			blocks.add(Blocks.field_150363_s);
			// Leaves
			blocks.add(Blocks.field_150362_t);
			blocks.add(Blocks.field_150361_u);
			// Planks
			blocks.add(Blocks.field_150344_f);
			// Crafting Table
			blocks.add(Blocks.field_150462_ai);
			// Pumpkin
			blocks.add(Blocks.field_150423_aK);
			// Lit Pumpkin
			blocks.add(Blocks.field_150428_aP);
			// Vines
			blocks.add(Blocks.field_150395_bd);
			// Melon
			blocks.add(Blocks.field_150440_ba);
		}
		return blocks;
	}

	/**
	 * This check if the block can be mined by the custom axe
	 * @param ItemStack stack
	 * @param IBlockState state
	 * @return
	 */
	private boolean checkStrVsBlock(ItemStack stack, IBlockState state) {
		
		boolean b = false;
		
		// Check Block List that the axe can mine...
		Iterator<Block> it = blocks.iterator();
		
		while(it.hasNext()) {
			Block block = it.next();
			
			if(block == state.func_177230_c()) {
				b = true;
				break;
			}
		}
		
		
		// Check Materials
		Material material = state.func_185904_a();
		
		// Added in harvest tool and harvest level
		return b || 
			   material == Material.field_151575_d || 
			   material == Material.field_151585_k || 
			   material == Material.field_151582_l || 
			   (((state.func_177230_c().getHarvestTool(state) != null && state.func_177230_c().getHarvestTool(state).equals("axe"))? true : false) && state.func_177230_c().getHarvestLevel(state) <= this.material.func_77996_d());
	}
	
	
	@Override
	public float func_150893_a(ItemStack stack, IBlockState state) {
		// TODO Auto-generated method stub
		return (!checkStrVsBlock(stack, state))? super.func_150893_a(stack, state) : this.material.func_77998_b();
	}
}
