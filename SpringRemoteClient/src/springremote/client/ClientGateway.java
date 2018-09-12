package springremote.client;

import springremote.client.contract.TestRemoteClient;
import springremote.client.dto.TestRequestDto;
import springremote.client.dto.TestResponseDto;
import springremote.context.ApplicationContextProvider;

public class ClientGateway {
	public void callRemoteService() {
		
		TestRemoteClient bean = ApplicationContextProvider.getApplicationContext()
				.getBean("springRemoteClient-TestRemoteClient", TestRemoteClient.class);

		if (bean != null) {
			System.out.println("got bean...");
			
			TestRequestDto requestDto = new TestRequestDto();
			requestDto.setRequestString("This-is-a-test-request");
			TestResponseDto responseDto = bean.doWork(requestDto);
			
			System.out.println("Reponse::"+responseDto.getResponseString());
		}
		
	}
	
}
