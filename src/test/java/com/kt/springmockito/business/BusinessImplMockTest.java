package com.kt.springmockito.business;

import java.util.ArrayList;
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
import static org.mockito.Mockito.spy;


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
	@Test
	public void testMock() {
		ArrayList arralistMock=mock(ArrayList.class);
		System.out.println(arralistMock.get(0));//null
		System.out.println(arralistMock.size());//0
		System.out.println(arralistMock.add("Test"));
		System.out.println(arralistMock.size());//0
		when(arralistMock.size()).thenReturn(5);
		System.out.println(arralistMock.size());
	}
	@Test
	public void testSpy() {
		ArrayList arralistApy=spy(ArrayList.class);
		arralistApy.add("test");
		System.out.println(arralistApy.get(0));//null
		System.out.println(arralistApy.size());//0
		System.out.println(arralistApy.add("Test"));
		System.out.println(arralistApy.size());//0
		when(arralistApy.size()).thenReturn(5);
		System.out.println(arralistApy.size());
	}
	
}
