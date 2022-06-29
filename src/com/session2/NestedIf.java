package com.session2;

public class NestedIf {
public static void main(String[] args) {
	
	int a=70;
	int b=90;
	int c=100;
	
	if (c>b)
	{
		if(b<a)
		{
			System.out.println("abc");
		}
		else
		{
			System.out.println("xyz");
		}
		
	}
	else
		System.out.println("bye");
	
}
}
