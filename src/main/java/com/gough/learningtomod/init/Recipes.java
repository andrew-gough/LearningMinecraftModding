package com.gough.learningtomod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init(){
		//Shaped recipe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemCursor)," s ","sss", " s ",'s', "stickWood"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.letterC), new ItemStack(Blocks.wool),new ItemStack(Blocks.wool),new ItemStack(Blocks.wool),new ItemStack(Blocks.wool),new ItemStack(Blocks.wool)));
		//Compressed Gold Block Recipe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.compressedGold),"ggg","gdg","ggg",'g',"blockGold",'d',"blockDiamond"));
		//Hand Of Midas Recipe
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemHandOfMidas), "g  ","gg ","gg ",'g',ModBlocks.compressedGold);
	}
	
}
