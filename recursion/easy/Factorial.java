package com.recursion.easy;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(fact(5));
	}
	static int fact(int n)
	{
		
		if(n<2)
		{
			return 1;
		} 
		int prev=n-1;
		return n*fact(prev);
	}

}
