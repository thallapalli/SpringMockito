package com.kt.springmockito;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kt.springmockito.entity.Item;

@RestController
public class ItemController {
	@GetMapping(value = "/dummy-item")
	public Item dummyItem() {
		return  new Item(1,"Ball",10,2);
		
	}
}
