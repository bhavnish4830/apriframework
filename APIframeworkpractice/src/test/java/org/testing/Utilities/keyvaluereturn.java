package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testing.TestSteps.getmethod;

import io.restassured.response.Response;

public class keyvaluereturn {

	public static int getkey(String Url)
	{
		
		Response res = getmethod.getrequest(Url);
		JSONArray jar = new JSONArray(res.asString());
		JSONObject job = jar.getJSONObject(0);
		int key =  job.getInt("id"); 
		
		return key;
		
	}
	
	public static String getStringkey(String Url, String keyname)
	{
		
		Response res = getmethod.getrequest(Url);
		JSONArray jar = new JSONArray(res.asString());
		JSONObject job = jar.getJSONObject(0);
		String  Stringkey =  job.getString(keyname);
		
		return Stringkey;
		
	}
	
	
	
	
	public static void main(String[] args) 
	{

	}

}
