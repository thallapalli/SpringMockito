package com.kt.springmockito.datalayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.kt.springmockito.entity.Item;
import com.kt.springmockito.repo.ItemRepository;

@DataJpaTest
public class ItemRepositoryTest {
	@Autowired
	ItemRepository itemRepository;
	@Test
	public void testFindAll() {
		List<Item> findAll = itemRepository.findAll();
		assertEquals(3,findAll.size());
	}
}
