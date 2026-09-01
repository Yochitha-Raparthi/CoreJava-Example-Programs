package com.studinfo;

class Solution {
	static {
	 System.out.println("Static Block Called");
	 Solution s=new Solution();
	}
	public static void main(String[] args) {
		System.out.println(" main method Started");
		 
	    System.out.println(" Main method ended");
	}
       {
		System.out.println("welcome to instance block");	
	   }

}
