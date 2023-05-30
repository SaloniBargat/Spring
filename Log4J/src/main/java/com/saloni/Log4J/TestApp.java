package com.saloni.Log4J;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class TestApp {
	
	private static Logger log=Logger.getLogger(TestApp.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout layout=new PatternLayout("%p %d{ yyyy-MMM-dd   HH:mm:ss}   %l   [%m] %n");
		Appender app=new ConsoleAppender(layout);
		log.addAppender(app);
		
		log.debug("HELLO-ONE");
		log.info("HELLO-TWO");
		log.warn("HELLO-ABC");
		log.error("HELLO-XYZ");
		log.fatal("HELLO-PQR");

	}

}
