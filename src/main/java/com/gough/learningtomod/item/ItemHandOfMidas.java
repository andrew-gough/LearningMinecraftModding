package com.gough.learningtomod.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.gough.learningtomod.creativetab.CreativeTabLTM;
import com.gough.learningtomod.utility.LogHelper;




public class ItemHandOfMidas extends ItemLTM{

	Block currentBlock = Blocks.gold_block;
	
	
	
	
	public ItemHandOfMidas(){
		super();
		this.setUnlocalizedName("itemHandOfMidas");
		this.setCreativeTab(CreativeTabLTM.tabLTM);
	}
	
	public ItemStack onItemRightClick(ItemStack itemStack,World world,EntityPlayer player){
		if(player.isSneaking()){
			LogHelper.info("Inventory Should Open here!");
			//OpenUpInventoryToSelectBlockToUse
		}
		return itemStack;
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		if(player.isSneaking()){
			LogHelper.info("Inventory Should Open here!");
			//OpenUpInventoryToSelectBlockToUse
		}else{
		world.setBlock(x , y, z,currentBlock, 0, 2|3);
		}
		return true;
	}
	
	
}
