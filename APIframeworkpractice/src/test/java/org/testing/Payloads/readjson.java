package org.testing.Payloads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class readjson 
{
	public static JSONObject jsonread(String path) throws IOException
	{
		
		
		File f = new File(path);
		FileInputStream fs =  new FileInputStream(f);
		JSONTokener jt = new JSONTokener(fs);
		JSONObject job = new JSONObject(jt);
		
		return job;
		
	}

}
