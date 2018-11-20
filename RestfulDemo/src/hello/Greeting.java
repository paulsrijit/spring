package hello;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Greeting {
	
	private long id;
	private Map content;
	
	/*public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}*/
	
	public Greeting(long id) {
		super();
		this.id = id;
		this.content = null;
		
		File f = new File("c:\\temp\\tst.json");
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			this.content = objectMapper.readValue(f, java.util.Map.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public long getId() {
		return id;
	}

	public Map getContent() {
		return content;
	}
	
}
