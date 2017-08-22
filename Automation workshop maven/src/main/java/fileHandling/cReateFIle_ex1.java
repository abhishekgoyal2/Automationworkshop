package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class cReateFIle_ex1 

{
    public static void main( String[] args ) throws IOException
    {
    	File fl = new File("d:/my.txt");
    	
    	// create a file
    	
    	if(fl.createNewFile())
    	{
    		System.out.println("File is added");
    	}
    	else
    		System.out.println("Already File is added");
        
    	//write a file
    	
    	FileWriter fw = new FileWriter(fl) ;
    	
    	String  text = "this is java created text";
    	
    	fw.write(text);
    	fw.close();
    	
    	
    	// read a file
    	BufferedReader br = new BufferedReader(new FileReader(fl)) ;
    	
    	String str;
    	
    	 while ((str=br.readLine())!=null)    	
    	 {
    		
    		 System.out.println(str);
    	}
 
    	 
    //to delte a file 
    		if(fl.delete())
    		{
    			System.out.println(fl.getName() + " is deleted!");
    		}
    	 
    		else{
    			System.out.println("Delete operation is failed.");
    		}
    }
}
