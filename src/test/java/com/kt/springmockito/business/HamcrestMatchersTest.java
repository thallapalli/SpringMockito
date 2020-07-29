package com.kt.springmockito.business;


import java.util.Arrays;
import java.util.List;

import org.hamcrest.collection.HasItemInArray;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.skyscreamer.jsonassert.JSONAssert;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

@ExtendWith(MockitoExtension.class)
class HamcrestMatchersTest {
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
		assertThat(asList, hasItems(12,45));

	}
	
	

}
