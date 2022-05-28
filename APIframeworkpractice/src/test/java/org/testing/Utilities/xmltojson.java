package org.testing.Utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.XML;


public class xmltojson 
{
	
	public static String xmltojsonmethod(String xml)
	{
	
		JSONObject job =  XML.toJSONObject(xml);
		
		return job.toString();
		
		
	}
	
	public static String jsontoxml(String xml)
	{
		JSONObject job = new JSONObject(xml);
		String xmldata = XML.toString(job);
		return xmldata;
		
	}

public static void main(String[] args) throws IOException {
	
	
	
  String k = xmltojson.xmltojsonmethod("<fname>Bhavnsih</fname>\r\n"
  		+ "<lname>kapoor</lname>");
   System.out.println(k);


   String j =jsontoxml("{\"fname\":\"Bhavnsih\",\"lname\":\"kapoor\"}");
   System.out.println(j);


}




}
