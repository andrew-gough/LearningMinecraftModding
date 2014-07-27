package com.gough.learningtomod.creativetab;

import com.gough.learningtomod.init.ModItems;
import com.gough.learningtomod.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabLTM {

	public static final CreativeTabs tabLTM = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
		
		@SideOnly(Side.CLIENT)
		@Override
		public Item getTabIconItem()
	    {
	        return ModItems.itemCursor;
	    }
	};
	
}

