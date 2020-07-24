package com.kt.springmockito.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.kt.springmockito.data.BusinessService;

@ExtendWith(MockitoExtension.class)
class BusinessImplMockTest {
	@Mock
	BusinessService mock;
	@InjectMocks
	BusinessImpl businessImplTest ;
	

	

	@Test
	void testcalculdateSumDataService() {

		when(mock.retrieveAllData()).thenReturn(new int[] { 1, 2, 3 });
		assertEquals(6, businessImplTest.calculdateSumDataService());

	}

}
