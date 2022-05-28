package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.testing.Payloads.readjson;
import org.testing.TestSteps.getmethod;
import org.testing.Utilities.keyvaluereturn;
import org.testing.Utilities.loadproperty;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4 {

	public static void main(String[] args) throws IOException 
	{
			
			
	}
	
	@Test
	public static void TC4method() throws IOException
	{
		Properties prop = loadproperty.readproperty("../APIframeworkpractice/uri.properties");
		String url = prop.getProperty("URI_selenium");
		int key =	TC1.returnkey("URI_selenium");
		System.out.println(key);
		System.out.println(url);
   
	
    	JSONObject job =	readjson.jsonread("../APIframeworkpractice/post.json");
    	
    	
		String completeurl = url+"/"+key;
		System.out.println(completeurl);
		System.out.println(job.toString());
		
		Response res =  getmethod.putrequest(job.toString(), completeurl);
	
		System.out.println(res.asString());
	}

}
