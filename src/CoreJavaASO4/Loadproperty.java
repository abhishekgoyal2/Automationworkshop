package CoreJavaASO4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Loadproperty {
	
	static String filelocation="C:/Users/abhishek.goyal2/workspace/Automation_Assignment/resouce_xpath/Broserproperty.txt";
 String str1=null;
	
	public static String getvalue(String str) throws IOException
	{
		
		FileInputStream fis=new FileInputStream(filelocation);
		Properties prop = new Properties();
		
		prop.load(fis);
		String str1=prop.getProperty(str);
		System.out.println(str1);
		
return str1;
		
	}

}
