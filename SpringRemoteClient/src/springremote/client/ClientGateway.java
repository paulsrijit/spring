package springremote.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springremote.client.contract.TestRemoteClient;
import springremote.client.dto.TestRequestDto;
import springremote.client.dto.TestResponseDto;

public class ClientGateway {
	public void callRemoteService() {
		final ApplicationContext context = new ClassPathXmlApplicationContext("/WEB-INF/applicationContext.xml");
		if(context!=null) {
			System.out.println("got context....");
		}
		TestRemoteClient remoteServiceRef = (TestRemoteClient) context.getBean("springRemoteClient-TestRemoteClient");
		if(remoteServiceRef!=null) {
			System.out.println("got bean....");
		}
		/*TestRequestDto requestDto = new TestRequestDto();
		requestDto.setRequestString("This-is-a-test-request");
		TestResponseDto responseDto = remoteServiceRef.doWork(requestDto);
		
		System.out.println("Reponse::"+responseDto.getResponseString());*/
	}
	
}
