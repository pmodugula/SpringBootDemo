package com.example.demo.service;

public class SumService {
	private int param1;
	private int param2;
	private int sum;
	
	public SumService(int param1, int param2) {
		
		//this.param1=param1;
		//this.param2=param2;
		this.sum=param1+param2;
	}
	
/**	public int getParam1() {
			return param1;
		}
	public int getParam2() {
		return param2;
	}
	**/
	
	public int getSum() {
		return sum;
	}
	
}
