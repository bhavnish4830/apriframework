package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testing.TestSteps.getmethod;
import org.testing.Utilities.keyvaluereturn;
import org.testing.Utilities.loadproperty;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TC5 {

	public static void main(String[] args) throws IOException {


		
     Properties prop = loadproperty.readproperty("../APIframeworkpractice/uri.properties");
		String url = prop.getProperty("URI_apistudent");
	     Response res = getmethod.getrequest(url);
	     
	     System.out.println(res.asString());
	     String a = res.jsonPath().getString("fname");
	     
	     		System.out.println(a);
	     		
	     	 JSONArray jar  = new JSONArray(res.asString());
	     	 JSONObject job = jar.getJSONObject(0);
	     System.out.println(job.get("fname"));
	     		
	}
	
	
	@Test
	public static void tc5method() throws IOException
	{
		Properties prop = loadproperty.readproperty("../APIframeworkpractice/uri.properties");
		String url = prop.getProperty("URI_selenium");
		int key = keyvaluereturn.getkey(url);
		String completeurl = url+"/"+key;
		
		System.out.println(completeurl);
		
	Response res = 	getmethod.deletereqeust(completeurl);
	
	System.out.println(res.statusCode());
	}

}
