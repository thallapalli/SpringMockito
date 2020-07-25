package com.kt.springmockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kt.springmockito.business.ItemBusinessService;
import com.kt.springmockito.entity.Item;

@RestController
public class ItemController {
	@Autowired
	private ItemBusinessService itemBusinessService;
	@GetMapping(value = "/dummy-item")
	public Item dummyItem() {
		
		return  new Item(1,"Ball",10,2);
		
	}
	@GetMapping(value = "/item-from-service")
	public Item ItemFromService() {
		
		return  itemBusinessService.retrieveHardCodedItem();
		
	}
}
