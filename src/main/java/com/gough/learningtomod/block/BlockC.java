package com.gough.learningtomod.block;

import com.gough.learningtomod.creativetab.CreativeTabLTM;

import net.minecraft.block.material.Material;

public class BlockC extends BlockLTM {

	public BlockC(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(CreativeTabLTM.tabLTM);
	}

	public BlockC() {
		super();
		this.setBlockName("letterC");
		this.setCreativeTab(CreativeTabLTM.tabLTM);
		// TODO Auto-generated constructor stub
	}

}
