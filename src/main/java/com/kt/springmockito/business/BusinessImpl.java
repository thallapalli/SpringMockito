package com.kt.springmockito.business;

import com.kt.springmockito.data.BusinessService;

public class BusinessImpl {
	private BusinessService businessService;
	
	public int calculdateSum(int[] nums) {
		int sum=0;
		for(int a:nums) {
			sum+=a;
		}
		return sum;
		
	}
	
	public int calculdateSumDataService() {
		int sum=0;
		int[] nums=businessService.retrieveAllData();
		for(int a:nums) {
			sum+=a;
		}
		return sum;
		
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}
	
	
}
