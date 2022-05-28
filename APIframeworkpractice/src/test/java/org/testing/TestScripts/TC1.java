package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.Payloads.readjson;
import org.testing.TestSteps.getmethod;
import org.testing.Utilities.keyvaluereturn;
import org.testing.Utilities.loadproperty;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1 {

	
	
	
	public static void main(String[] args)  {
		
		
		
		
	}
	
	@Test
	public static int returnkey(String propname) throws IOException
	{
        Properties prop = loadproperty.readproperty("../APIframeworkpractice/uri.properties");
		
		String url = prop.getProperty(propname);
		
		JSONObject body = readjson.jsonread("../APIframeworkpractice/example.json");
		String body1 = body.toString();
		
		Response res = getmethod.postrequest(body1, url);
			
		int key = keyvaluereturn.getkey(url);
		return key;
		
	}

}
