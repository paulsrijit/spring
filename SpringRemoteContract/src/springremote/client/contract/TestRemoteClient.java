package springremote.client.contract;

import springremote.client.dto.TestRequestDto;
import springremote.client.dto.TestResponseDto;

public interface TestRemoteClient {

	TestResponseDto doWork(TestRequestDto requestDto);
}
