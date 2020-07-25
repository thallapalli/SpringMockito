package com.kt.springmockito.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.kt.springmockito.ItemController;
import com.kt.springmockito.business.ItemBusinessService;
import com.kt.springmockito.entity.Item;

@WebMvcTest(value = ItemController.class)
public class ItemControllerTest {
	@Autowired
	MockMvc MockMvc;
	@MockBean
	private ItemBusinessService itemBusinessService;

	@Test
	public void testhelloworld() throws Exception {
		// call /hello-world
		// response Hello World
		RequestBuilder req = MockMvcRequestBuilders.get("/dummy-item").accept(MediaType.APPLICATION_JSON);
		MockMvc.perform(req).andExpect(status().isOk())
				.andExpect(content().json("{\"id\": 1,\"name\":\"Ball\",\"quantity\":2}")).andReturn();

	}
	@Test
	public void testItemfrombusinessService() throws Exception {
		// call /hello-world
		// response Hello World
		when(itemBusinessService.retrieveHardCodedItem()).thenReturn(new Item(1,"Ball",2,2));
		RequestBuilder req = MockMvcRequestBuilders.get("/item-from-service").accept(MediaType.APPLICATION_JSON);
		MockMvc.perform(req).andExpect(status().isOk())
				.andExpect(content().json("{\"id\": 1,\"name\":\"Ball\",\"quantity\":2}"));

	}
	

}
