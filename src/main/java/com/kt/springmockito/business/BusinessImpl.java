package com.kt.springmockito.business;

import java.util.Arrays;

import com.kt.springmockito.data.BusinessService;

public class BusinessImpl {
	private BusinessService businessService;
	
	public int calculdateSum(int[] nums) {
		return Arrays.stream(nums).reduce(Integer::sum).orElse(0);
		
		
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
