package com.gough.learningtomod.handler;

import java.io.File;

import com.gough.learningtomod.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

	public static Configuration config; 
	public static boolean testValue = false;

	public static void init(File configFile) {
		boolean configValue = false;
		if (config == null) {
			// create the config from the given config file
			config = new Configuration(configFile);
			loadConfig();
		}
	}

	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent cEvent) {
		if (cEvent.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfig();
		}
	}

	private static void loadConfig() {

		testValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");

		if (config.hasChanged()) {
			config.save();
		}

	}
}