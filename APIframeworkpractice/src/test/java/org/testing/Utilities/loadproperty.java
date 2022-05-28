package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class loadproperty 
{
	
	
	public static Properties readproperty(String path) throws IOException
	{
		
		File f = new File(path);
		FileInputStream fs = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fs);
		return prop;

	}

}
