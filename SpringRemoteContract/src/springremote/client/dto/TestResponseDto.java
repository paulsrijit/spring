package springremote.client.dto;

import java.io.Serializable;

public class TestResponseDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4229140421953526314L;
	private String responseString;

	public String getResponseString() {
		return responseString;
	}

	public void setResponseString(String responseString) {
		this.responseString = responseString;
	}
	
}
