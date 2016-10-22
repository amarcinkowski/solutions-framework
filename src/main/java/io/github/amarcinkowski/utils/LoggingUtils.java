package io.github.amarcinkowski.utils;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;

public class LoggingUtils {

	public static void setLevel(Level level) {
		LogManager.getRootLogger().setLevel(level);
	}

}
