package com.kt.springmockito.controller;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.kt.springmockito.HelloWorldController;

@WebMvcTest(value=HelloWorldController.class)
public class HelloWorldControllerTest {
	@Autowired
	MockMvc MockMvc;
	@Test
	public void testhelloworld() throws Exception {
		//call /hello-world
		//response Hello World
		RequestBuilder req = MockMvcRequestBuilders
				.get("/hello-world")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult mvcResult=MockMvc.perform(req)
				.andExpect(content().string("Hello World"))
				.andReturn();
		assertEquals("Hello World", mvcResult.getResponse().getContentAsString());
		
	}

}
