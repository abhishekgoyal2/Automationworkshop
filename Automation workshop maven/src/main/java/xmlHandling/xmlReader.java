package xmlHandling;

/**

 * @version $Id: UtilityTools.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import fileHandling.loadPropety;


@SuppressWarnings("unused")

public class xmlReader 
{

	
	private static boolean loaded = false; 
	
	public static void main(String args[]) throws Exception
	{
	
		getXMLTagValue("dc","username");
		//getXMLTagValue();
		
	}
	
	public static String getXMLTagValue(String bTag, String sTag) throws Exception 
	{
	
//		String  b1 = "local";
//		String  b2 = "username";
//		
		if(loaded == false)
			
			
		
		System.out.println("Loading xml file");
		 File file = new File(loadPropety.getValue("xmlf"));
		 //File file = new File(load_Property.getString("TD"));
		 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		 DocumentBuilder db = dbf.newDocumentBuilder();
		 
		 Document document = db.parse(file);
		 
		 document.getDocumentElement().normalize();
		 NodeList node = document.getElementsByTagName(bTag);
		 Node nNode = node.item(0);
		 Element eElement = (Element) nNode;
		 NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		 Node nValue = (Node) nlList.item(0);
		 System.out.println(nValue.getNodeValue());
		 
		 loaded=true;
		 
		 return nValue.getNodeValue();
		 
	}
	
/*	public static String getTagValue(String sTag, Element eElement) 
	{
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		Node nValue = (Node) nlList.item(0);
		
	 	return nValue.getNodeValue();
	}
	

	public static void deleteInfoFile (String fileName) 
	{
		File fileTemp = new File(fileName);
		if (fileTemp.exists()){
			fileTemp.delete();
		}
	}*/

}
