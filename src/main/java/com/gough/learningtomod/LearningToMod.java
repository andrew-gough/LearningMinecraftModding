package com.gough.learningtomod;

import com.gough.learningtomod.handler.ConfigurationHandler;
import com.gough.learningtomod.init.ModBlocks;
import com.gough.learningtomod.init.ModItems;
import com.gough.learningtomod.init.Recipes;
import com.gough.learningtomod.proxy.IProxy;
import com.gough.learningtomod.reference.Reference;
import com.gough.learningtomod.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;


@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)


//pre init, init,post init
public class LearningToMod {
	
	@Mod.Instance(Reference.MOD_ID)
	public static  LearningToMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		// Read in config here
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		ModItems.init();
		ModBlocks.init();
		LogHelper.info("preInit Complete");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		Recipes.init();
		LogHelper.info("init Complete");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		LogHelper.info("postInit Complete");
	}
}
