package com.kt.springmockito.business;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;


@ExtendWith(MockitoExtension.class)
class BusinessImplMockTest {
	
	List list=mock(List.class);
	@Test
	public void TestSize() {
		when(list.size()).thenReturn(5);
		assertEquals(5,list.size());
		
	}
	@Test
	public void TestParameter() {
		when(list.get(2)).thenReturn("Karnakar");
		assertEquals("Karnakar",list.get(2));
		
	}
	@Test
	public void TestParameter1() {
		when(list.get(anyInt())).thenReturn("Karnakar");
		assertEquals("Karnakar",list.get(3));
		
	}
}
