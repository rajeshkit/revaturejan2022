package loggingdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RevatureDemo {
	// log4j2
	
	public static void main(String[] args) {
		Logger logger= LogManager.getLogger(RevatureDemo.class);
		logger.trace("this is trace log");
		logger.debug("this is debug log");
		logger.info("this is info log");
		logger.warn("this is warn log");
		logger.error("this is error log"); //default level
		logger.fatal("this is fatal log");
	
	}
}
