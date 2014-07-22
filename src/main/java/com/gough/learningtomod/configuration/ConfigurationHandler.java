package com.gough.learningtomod.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	
	public static void init(File configFile){
		boolean configValue = false;
		// create the config from the given config file
		Configuration config = new Configuration(configFile);
		
		try{
			// try to load the configs
			config.load();
			// read in properties from the file
			configValue = config.get("Config Test", "configValue", true, "This is an example config value").getBoolean(true);
		}catch(Exception e){
			//Exception
			e.printStackTrace();
		}
		finally
		{
			// save the config file
			config.save();
		}
		System.out.println("configValue is: " + configValue);
}
}
