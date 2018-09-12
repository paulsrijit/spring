package springremoteserviceweb.service;

import springremote.client.contract.TestRemoteClient;
import springremote.client.dto.TestRequestDto;
import springremote.client.dto.TestResponseDto;

public class TestRemoteClientService implements TestRemoteClient {

	@Override
	public TestResponseDto doWork(TestRequestDto requestDto) {
		TestResponseDto responseDto = null;
		if (requestDto != null) {
			System.out.println("got a requset..");
			if (requestDto.getRequestString() != null && !requestDto.getRequestString().trim().isEmpty()) {
				responseDto = new TestResponseDto();
				responseDto.setResponseString(requestDto.getRequestString().replaceAll("request", "response"));
			}
		}
		return responseDto;
	}

}
