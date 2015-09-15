package net.vincerp.kitchenlab;

import net.vincerp.kitchenlab.config.ConfigHandler;
import net.vincerp.kitchenlab.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class KitchenLab {

	@Instance(Reference.MOD_ID)
	public static KitchenLab instance;
	
	@EventHandler
	void preInit(FMLPreInitializationEvent event){
		System.out.print("Setting up " + Reference.MOD_NAME + "...");
		
		ConfigHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@EventHandler
	void init(FMLInitializationEvent event){
		System.out.print("Initializing " + Reference.MOD_NAME + "...");
		
	}
	
	@EventHandler
	void postInit(FMLPostInitializationEvent event){
		System.out.print("Finalizing " + Reference.MOD_NAME + "...");
	}
}
