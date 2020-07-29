package com.kt.springmockito.intg;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.client.RestClientException;
//XUNITPATTERNS
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ItemControllerIntgerationTest {
	@Autowired
	private TestRestTemplate testRestTemplate;
	@Test
	public void contextLoads() throws RestClientException, JSONException {
		String response=this.testRestTemplate.getForObject("/all-items-from-database", String.class);
		JSONAssert.assertEquals("[{id:10001}, {id:10002}, {id:10003}]",response,false);
	
	}
}
