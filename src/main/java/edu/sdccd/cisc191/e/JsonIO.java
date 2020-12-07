package edu.sdccd.cisc191.e;

import java.io.FileReader;
import java.nio.file.*;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonIO {
	
	private static String filename;
	
	public JsonIO(String filename) {
	    JsonIO.filename = filename;
	  }
			
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		JsonIO.filename = filename;
	}
	
	@SuppressWarnings("unchecked")
	public static void writeJson(String filename, ArrayList<String> array) throws Exception {
	    JSONObject sampleObject = new JSONObject();	    
	    
	    for (int i = 0; i < array.size(); i++) {
	    	String[] arrOfStr = array.get(i).split("-", 2);
	    	sampleObject.put(arrOfStr[0], arrOfStr[1]);
	    }
	    Files.write(Paths.get(filename), sampleObject.toJSONString().getBytes());
	}
	
	public static Object readJson() throws Exception {
	    FileReader reader = new FileReader(filename);
	    JSONParser jsonParser = new JSONParser();
	    return jsonParser.parse(reader);
	}
	
	public static Object getMoveValue(String move) throws Exception {
		JSONObject jsonObject = (JSONObject) readJson();
		return jsonObject.get(move);
	}
	
	@SuppressWarnings("unchecked")
	public static void addMove(String moveName, String value) throws Exception {
		JSONObject jsonObject = (JSONObject) readJson();
		jsonObject.put(moveName, value);
		Files.write(Paths.get(filename), jsonObject.toJSONString().getBytes());		
	}
	
	public static void removeMove(String moveName) throws Exception {
		JSONObject jsonObject = (JSONObject) readJson();
		jsonObject.remove(moveName);
		Files.write(Paths.get(filename), jsonObject.toJSONString().getBytes());		
	}

}


