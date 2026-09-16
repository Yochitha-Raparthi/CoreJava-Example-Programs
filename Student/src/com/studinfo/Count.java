package com.studinfo;

public class Count {
    int cnt=10;
//    {
//    	cnt++;
//    }
	public static void main(String[] args) {
		Count c1=new Count();
		
		Count c2=new Count();
		
		c1.cnt=20;
		
		System.out.println("Count : "+c1.cnt);
	}

}
