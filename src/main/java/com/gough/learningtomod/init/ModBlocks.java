package com.gough.learningtomod.init;


import com.gough.learningtomod.block.*;
import com.gough.learningtomod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModBlocks {

	
	public static final BlockLTM letterC = new BlockC();
	public static final BlockLTM letterU = new BlockU();
	public static final BlockLTM letterN = new BlockN();
	public static final BlockLTM letterT = new BlockT();
	public static final BlockLTM compressedGold = new BlockCompressedGold();
	
	public static void init(){
		GameRegistry.registerBlock(compressedGold,"compressedGold");
		GameRegistry.registerBlock(letterC,"letterC");
		GameRegistry.registerBlock(letterU,"letterU");
		GameRegistry.registerBlock(letterN,"letterN");
		GameRegistry.registerBlock(letterT,"letterT");
	}
}
