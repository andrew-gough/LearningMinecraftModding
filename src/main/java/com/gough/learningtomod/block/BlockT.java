package com.gough.learningtomod.block;

import com.gough.learningtomod.creativetab.CreativeTabLTM;

import net.minecraft.block.material.Material;

public class BlockT extends BlockLTM {

	public BlockT(Material material) {
		super(material);
		this.setCreativeTab(CreativeTabLTM.tabLTM);
		// TODO Auto-generated constructor stub
	}

	public BlockT() {
		super();
		this.setBlockName("letterT");
		this.setCreativeTab(CreativeTabLTM.tabLTM);
		// TODO Auto-generated constructor stub
	}

}
