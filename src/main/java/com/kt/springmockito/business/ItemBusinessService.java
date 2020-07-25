package com.kt.springmockito.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kt.springmockito.entity.Item;
import com.kt.springmockito.repo.ItemRepository;
@Component
public class ItemBusinessService {
	@Autowired
	private  ItemRepository itemRepository;
	public Item retrieveHardCodedItem() {
		return new Item(1,"Ball",10,2);
	}
	
	public List<Item> retrieveAllItem() {
		return itemRepository.findAll();
		
	}

}
