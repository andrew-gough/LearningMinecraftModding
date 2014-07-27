package com.gough.learningtomod.init;

import com.gough.learningtomod.item.*;
import com.gough.learningtomod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;



@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemLTM itemCursor = new ItemCursor();
	public static final ItemLTM itemHandOfMidas = new ItemHandOfMidas();
	
	public static void init(){
		GameRegistry.registerItem(itemCursor,"itemCursor");
		GameRegistry.registerItem(itemHandOfMidas,"itemHandOfMidas");
	}
	
}
