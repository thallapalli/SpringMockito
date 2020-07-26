package com.kt.springmockito.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.kt.springmockito.entity.Item;
import com.kt.springmockito.repo.ItemRepository;



@ExtendWith(MockitoExtension.class)
class ItemBusinessServiceTest {
	@InjectMocks
	ItemBusinessService itemBusinessService;
	@Mock
	ItemRepository itemRepository;
	@Test
	public void testretrieveAllItem() {
		when(itemRepository.findAll()).thenReturn(Arrays.asList(new Item(1,"Ball",2,2)));
		List<Item> retrieveAllItem = itemBusinessService.retrieveAllItem();
		assertEquals(4,retrieveAllItem.get(0).getValue());
		
	}
	
	
	
}
