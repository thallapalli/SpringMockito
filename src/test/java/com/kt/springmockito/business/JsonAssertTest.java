package com.kt.springmockito.business;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.skyscreamer.jsonassert.JSONAssert;

@ExtendWith(MockitoExtension.class)
class JsonAssertTest {
String actualResponse="{\"id\":1,\"name\":\"Ball\",\"quantity\":2,\"price\":10}";

	

	@Test
	void jsonAssert() throws JSONException {

		String expectedResponse="{\"id\":1,\"name\":\"Ball\",\"quantity\":2,\"price\":10}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, true);

	}

}
