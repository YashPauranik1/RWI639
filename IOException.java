package Jun10;

import java.io.File;
import java.io.FileReader;

public class IOException
{
	
	public static void main(String[] args)
	{
		System.out.println("WelCome");
		Object FileReaderfr = null;		
		FileReader fr = null;
		try 
		{
		    File file = new File("file.txt");
		    fr = new FileReader(file);
		    char [] a = new char[50];
		    fr.read(a);   // reads the content to the array
		for(char c : a)
		System.out.print(c);   // prints the characters one by one
		      } 
		catch (Exception e) 
		{
		e.printStackTrace();
		}
		finally
		{
		try 
		{
		fr.close();
	    } 
		catch (Exception ex) 
		{		
		ex.printStackTrace();
	    }
	 }
		
	}
	
}


