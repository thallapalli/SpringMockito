package com.kt.springmockito.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.kt.springmockito.data.BusinessService;

class BusinessServiceStub implements BusinessService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3};
	}
	
}

class BusinessImplStubTest {

	@Test
	void testcalculdateSumDataService() {
		
		BusinessImpl businessImplTest=new BusinessImpl();
		businessImplTest.setBusinessService(new BusinessServiceStub());
		int actual = businessImplTest.calculdateSumDataService();
		int expected=6;
		assertEquals(expected, actual);
		
	}

}
