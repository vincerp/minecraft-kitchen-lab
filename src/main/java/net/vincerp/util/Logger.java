package net.vincerp.util;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;
import net.vincerp.kitchenlab.lib.Reference;

public class Logger {

	public static void log(Level level, String message){
		FMLLog.log(Reference.MOD_ID, level, message);
	}
	
	public static void all(String message) {
		log(Level.ALL, message);
	}
	
	public static void debug(String message)
    {
        log(Level.DEBUG, message);
    }

    public static void error(String message)
    {
        log(Level.ERROR, message);
    }

    public static void fatal(String message)
    {
        log(Level.FATAL, message);
    }

    public static void info(String message)
    {
        log(Level.INFO, message);
    }

    public static void off(String message)
    {
        log(Level.OFF, message);
    }

    public static void trace(String message)
    {
        log(Level.TRACE, message);
    }

    public static void warn(String message)
    {
        log(Level.WARN, message);
    }
}
