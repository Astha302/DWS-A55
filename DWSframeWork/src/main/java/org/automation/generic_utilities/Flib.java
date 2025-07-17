package org.automation.generic_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Flib {
	public static String readFromProperties(String key) {
		File f = new File("./Test Data/config.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
			try 
			{
				prop.load(fis);
			}
	
	catch(IOException e) 
	{
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
}
