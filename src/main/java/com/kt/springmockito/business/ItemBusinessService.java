package com.kt.springmockito.business;

import org.springframework.stereotype.Component;

import com.kt.springmockito.entity.Item;
@Component
public class ItemBusinessService {

	public Item retrieveHardCodedItem() {
		return new Item(1,"Ball",10,2);
	}

}
