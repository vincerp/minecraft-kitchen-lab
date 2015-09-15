package net.vincerp.kitchenlab.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

	public static void init(File configFile){
		Configuration config = new Configuration(configFile);
		
		try{
			config.load();
			
			boolean useConfig = config.getBoolean(Configuration.CATEGORY_GENERAL, "configValue", true, "sample value");
		} catch (Exception e) {
			
		} finally{
			config.save();
		}
		
		System.out.println(config.getConfigFile().getAbsolutePath());
	}
}
