package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.getmethod;
import org.testing.Utilities.loadproperty;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3 {

	public static void main(String[] args) throws IOException 
	{
	}

	@Test
	public static Response getallrecords(String propname) throws IOException
	{
		Properties prop  = loadproperty.readproperty("../APIframeworkpractice/uri.properties");
		String path = prop.getProperty(propname);
       Response res = getmethod.getrequest(path);
       System.out.println(res.asString());
       return res;
		
	}
}
