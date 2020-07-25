package com.kt.springmockito.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BusinessImplTest {

	@Test
	void testcalculdateSum() {
		
		BusinessImpl businessImplTest=new BusinessImpl();
		int actual = businessImplTest.calculdateSum(new int[] {1,2,3});
		int expected=6;
		assertEquals(expected, actual);
		
	}

}
