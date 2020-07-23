package com.kt.springmockito.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.kt.springmockito.data.BusinessService;

class BusinessImplMockTest {
	BusinessImpl businessImplTest = new BusinessImpl();
	BusinessService mock = mock(BusinessService.class);

	@BeforeEach
	public void before() {
		businessImplTest.setBusinessService(mock);
	}

	@Test
	void testcalculdateSumDataService() {

		when(mock.retrieveAllData()).thenReturn(new int[] { 1, 2, 3 });
		assertEquals(6, businessImplTest.calculdateSumDataService());

	}

}
