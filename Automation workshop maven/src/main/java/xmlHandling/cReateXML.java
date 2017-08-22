package xmlHandling;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class cReateXML 
{
	public static void main(String argv[]) throws ParserConfigurationException, TransformerException 
	{
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		// root elements
		Document doc = docBuilder.newDocument();
		
		Element rootElement = doc.createElement("Company");
		doc.appendChild(rootElement);
		
		Element staff = doc.createElement("Staff");
		rootElement.appendChild(staff);
		
		// set attribute to staff element
				Attr attr = doc.createAttribute("id");
				attr.setValue("1");
				staff.setAttributeNode(attr);
				
				Element firstname = doc.createElement("FirstName");		
				firstname.appendChild(doc.createTextNode("HItain"));
				staff.appendChild(firstname);
				
				Element lastname = doc.createElement("LastName");		
				lastname.appendChild(doc.createTextNode("Singh"));
				staff.appendChild(lastname);
				
				Element nickname = doc.createElement("NicktName");		
				nickname.appendChild(doc.createTextNode("HIt"));
				staff.appendChild(nickname);
				

				Element salary = doc.createElement("Salary");		
				salary.appendChild(doc.createTextNode("1000"));
				staff.appendChild(salary);
				
				
				
				///////////////
				Element staff2 = doc.createElement("Staff");
				rootElement.appendChild(staff2);
				
				// set attribute to staff element
						Attr attr1 = doc.createAttribute("id");
						attr1.setValue("2");
						staff2.setAttributeNode(attr1);
						
						
				
				// write the content into xml file
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				
				StreamResult result = new StreamResult(new File("D:\\file.xml"));
				
				transformer.transform(source, result);
				
			//	transformer.transform(source, result);


				System.out.println("File saved!");




		



		    		
		  
	}
}
