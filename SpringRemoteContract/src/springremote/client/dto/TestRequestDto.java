package springremote.client.dto;

import java.io.Serializable;

public class TestRequestDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8093119057277898532L;
	private String requestString;

	public String getRequestString() {
		return requestString;
	}

	public void setRequestString(String requestString) {
		this.requestString = requestString;
	}
	
}
