package com.gough.learningtomod.block;

import com.gough.learningtomod.creativetab.CreativeTabLTM;

import net.minecraft.block.material.Material;

public class BlockCompressedGold extends BlockLTM {

	public BlockCompressedGold(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(CreativeTabLTM.tabLTM);
	}

	public BlockCompressedGold() {
		super();
		this.setBlockName("compressedGold");
		this.setCreativeTab(CreativeTabLTM.tabLTM);
		// TODO Auto-generated constructor stub
	}

}
