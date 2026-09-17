package com.javafundamentals;

public class TestMethods1 {

	public static void factors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");			
			}
		}
	}
	public static void check(int n) {
		if(n>0) {
			System.out.println("It is positive number");
		}
		else if(n<0) {
			System.out.println("It is negative number");
		}else {
			System.out.println("It is zero");
		}
	}
	public static boolean checkPrime(int a){
		if(a==1) {
			return false;
		}
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void prime(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(checkPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static void fibonacci(int n) {
		int a=1,b=1;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		
	}
	public static void reverse(int n) {
		while(n>0) {
			int rem=n%10;
			System.out.print(rem+" ");
			n=n/10;
		}
	}
	public static void sumOfEven(int a,int b) {
		int sum=0;
		for(int i=a+1;i<b;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	public static void nTables(int n) {
		for(int j=1;j<=n;j++){
			for(int i=1;i<=10;i++) {
				System.out.println(j+" * "+i+" = "+j*i);
			}
			System.out.println();
			
		}
	}
	public static boolean perfectNumber(int n) {
		for(int i=2;i*i<=n;i++) {
			if(i*i==n) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
//        factors(20);
//		check(20);
//		prime(1,20);
//		fibonacci(10);
//		reverse(12345);
//		sumOfEven(2,10);
//		nTables(3);
		if(perfectNumber(625)) {
			System.out.println("It is  a perfect number");
		}else {
			System.out.println("Not a perfect number");
		}
	}

}
