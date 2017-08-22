package loggoing;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//import logging_practice.Hello;

//import logging_practice.Hello;

public class logMain
{

	static
	{
		PropertyConfigurator.configure("Recources\\log4j.properties");
	}
	
	public final static Logger logger = Logger.getLogger(logMain.class);

	public static void main(String[] args)
	{
		
		/*logger.debug("this is ");
		logger.info("this is info");
		logger.error("this is error");
*/
	}
	

}