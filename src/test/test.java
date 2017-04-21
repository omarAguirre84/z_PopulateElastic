package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class test {

	
	public static void main(String[] args) {
		leerArchivo();
		
	}
	
	public static ArrayList<String> leerArchivo(){
		
		BufferedReader br = null;
		FileReader fr = null;
		ArrayList<Model> arrString = null;
		JSONParser parser = new JSONParser();
		
		
		try {
			Object obj = parser.parse(new FileReader("Employees50k.json"));
			JSONObject jsonObject = (JSONObject) obj;
			
			Model m = new Model(
								(String)jsonObject.get("FirstName"), 
								(String)jsonObject.get("LastName"), 
								(String)jsonObject.get("Designation"), 
								(String)jsonObject.get("Salary"), 
								(String)jsonObject.get("Address"), 
								(String)jsonObject.get("Gender"), 
								(String)jsonObject.get("Age").toString(), 
								(String)jsonObject.get("MaritalStatus"), 
								(String)jsonObject.get("Interests")
							);
			
			System.out.println(m.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
