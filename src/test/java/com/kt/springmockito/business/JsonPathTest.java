package com.kt.springmockito.business;

import static org.assertj.core.api.Assertions.assertThat;


import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

@ExtendWith(MockitoExtension.class)
class JsonPathTest {
String actualResponse="{\"id\":1,\"name\":\"Ball\",\"quantity\":2,\"price\":10}";

	

	@Test
	void jsonAssert() throws JSONException {

		String expectedResponse="[" + 
				"{\"id\":1,\"name\":\"test1\"}," + 
				"{\"id\":2,\"name\":\"test2\"}," + 
				"{\"id\":3,\"name\":\"test3\"}" + 
	 
				"]";
		DocumentContext ctx = JsonPath.parse(expectedResponse);
		int read = ctx.read("$.length()");
		assertThat(read).isEqualTo(3);
		System.out.println(ctx.read("$..id").toString());
		
		System.out.println(ctx.read("$.[1]").toString());
		

	}

}
