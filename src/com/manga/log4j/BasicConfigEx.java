package com.manga.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class BasicConfigEx {
	private static Logger log = Logger.getLogger(BasicConfigEx.class);

	public static void main(String[] args) {
			
			log.trace("Trace message");
			log.debug("Debug information logging");
			log.info("Information logging");
			log.warn("Warning message");
			log.error("Error informationlogging");
			log.fatal("Fatal error message here");
		
	}

}
