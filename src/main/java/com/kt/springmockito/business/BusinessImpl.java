package com.kt.springmockito.business;

public class BusinessImpl {
	public int calculdateSum(int[] nums) {
		int sum=0;
		for(int a:nums) {
			sum+=a;
		}
		return sum;
		
	}
}
