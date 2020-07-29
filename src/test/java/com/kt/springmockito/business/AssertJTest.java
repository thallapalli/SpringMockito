package com.kt.springmockito.business;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

import java.util.Arrays;
import java.util.List;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.skyscreamer.jsonassert.JSONAssert;

@ExtendWith(MockitoExtension.class)
class AssertJTest {
String actualResponse="{\"id\":1,\"name\":\"Ball\",\"quantity\":2,\"price\":10}";

	

	@Test
	void jsonAssert() throws JSONException {

		String expectedResponse="{\"id\":1,\"name\":\"Ball\",\"quantity\":2,\"price\":10}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, true);

	}
	@Test
	void learning() throws JSONException {

		List<Integer> asList = Arrays.asList(12,1,45);
		assertThat(asList, hasSize(3));
	

	}
	
	

}
