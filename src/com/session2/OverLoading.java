package com.session2;

public class OverLoading {

	public void m1(int b,String a) {
		System.out.println(a);
	}
	public int m1(String a,int b,int c) {
		System.out.println(a+b);
		return b;
	}
	
}
