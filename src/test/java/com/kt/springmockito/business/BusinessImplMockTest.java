package com.kt.springmockito.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.kt.springmockito.data.BusinessService;

class BusinessImplMockTest {

	@Test
	void testcalculdateSumDataService() {

		BusinessImpl businessImplTest = new BusinessImpl();
		BusinessService mock = mock(BusinessService.class);
		businessImplTest.setBusinessService(mock);
		when(mock.retrieveAllData()).thenReturn(new int[] { 1, 2, 3 });
		int actual = businessImplTest.calculdateSumDataService();
		int expected = 6;
		assertEquals(expected, actual);

	}

}
