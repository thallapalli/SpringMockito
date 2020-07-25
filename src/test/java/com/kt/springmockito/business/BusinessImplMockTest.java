package com.kt.springmockito.business;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;


@ExtendWith(MockitoExtension.class)
class BusinessImplMockTest {
	
	List list=mock(List.class);
	@Test
	public void testSize() {
		when(list.size()).thenReturn(5);
		assertEquals(5,list.size());
		
	}
	@Test
	public void testParameter() {
		when(list.get(2)).thenReturn("Karnakar");
		assertEquals("Karnakar",list.get(2));
		
	}
	@Test
	public void testParameterArgumentmatcher() {
		when(list.get(anyInt())).thenReturn("Karnakar");
		assertEquals("Karnakar",list.get(3));
		
	}
	@Test
	public void testParameterArgumentmatcher1() {
		when(list.get(anyInt())).thenReturn("Karnakar");
		assertEquals("Karnakar",list.get(3));
		
	}
	@Test
	public void testVerificationbasics() {
		String val=(String) list.get(2);
		String val1=(String) list.get(2);
		verify(list,times(2)).get(anyInt());
		
	}
	
	@Test
	public void testArugment() {
		//SUT
		list.add("Karnakar");
		//Verification
		ArgumentCaptor<String> captor=ArgumentCaptor.forClass(String.class);
		verify(list).add(captor.capture());
		assertEquals("Karnakar", captor.getValue());
		
	}
	@Test
	public void testArugmentMultipleTimes() {
		//SUT
		list.add("Karnakar");
		list.add("Karnakar1");
		//Verification
		ArgumentCaptor<String> captor=ArgumentCaptor.forClass(String.class);
		verify(list,times(2)).add(captor.capture());
		List<String> allValues = captor.getAllValues();
		assertEquals("Karnakar", captor.getAllValues().get(0));
		assertEquals("Karnakar1", captor.getAllValues().get(1));
		
	}
	
}
