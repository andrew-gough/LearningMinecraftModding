package com.gough.learningtomod;

import com.gough.learningtomod.proxy.IProxy;
import com.gough.learningtomod.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;


@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME, version = Reference.VERSION)


//pre init, init,post init
public class LearningToMod {
	
	@Mod.Instance(Reference.MOD_ID)
	public static  LearningToMod instance;
	
	@SidedProxy(clientSide = "com.gough.learningtomod.proxy.ClientProxy", serverSide = "com.gough.learningtomod.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
