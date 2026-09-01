package com.studinfo;

public class Count {
    static int cnt;
    {
    	cnt++;
    }
	public static void main(String[] args) {
		Count c1=new Count();
		
		Count c2=new Count();
		
		Count c3=new Count();
		
		Count c4=new Count();
		
		System.out.println("Count : "+cnt);
	}

}
