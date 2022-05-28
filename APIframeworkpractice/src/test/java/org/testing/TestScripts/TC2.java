package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.getmethod;
import org.testing.Utilities.loadproperty;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2 
{
	
	
	@Test
	public static void tc2method() throws IOException
	{
		

		Properties prop = loadproperty.readproperty("../APIframeworkpractice/uri.properties");
		
		String url = prop.getProperty("URI_selenium");
		System.out.println(url);
		
		int key = TC1.returnkey("URI_selenium");
		System.out.println(key);
    
		Response res=	getmethod.getrequest(url+"/"+key);
		
		System.out.println(res.asString());
		
		
	}

}
