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
	public static int larger(int a,int b,int c) {
		if(a>b&&b>c) {
			return a;
		}else if(b>a&&b>c) {
			return b;
		}else {
			return c;
		}
	}
	public static int smaller(int a,int b,int c) {
		if(a<b&&b<c) {
			return a;
		}else if(b<a&&b<c) {
			return b;
		}else {
			return c;
		}
	}
	public static int countOfDigits(int n) {
		int cnt=0;
		while(n>0) {
			cnt++;
			n=n/10;
		}
		return cnt;
	}
	public static int sumOfDigits(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		return sum;
	}
	public static boolean palindrome(int n) {
		int num=n,sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(sum==num) {
			return true;
		}
		return false;
	}
	
	public static int reverseNumber(int n) {
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	
	public static boolean isPrime(int n) {
		for(int i=2;i*i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static int factorial(int n) {
		int num=1;
		for(int i=n;i>0;i--) {
			num*=i;
		}
		return num;
	}
	
	public static boolean armstrongNumber(int n) {
		int arm=0;
		int num=n;
		while(n>0) {
			int rem=n%10;
			arm+=(int)Math.pow(rem,countOfDigits(num));
			n=n/10;
		}
		
		if(arm==num) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int strongNumber(int n) {
		int num=0;
		while(n>0) {
			int rem=n%10;
			num+=factorial(rem);
			n=n/10;
		}
		return num;
	}
	public static void main(String[] args) {
		
//        factors(20);
//		check(20);
//		prime(1,20);
//		fibonacci(10);
//		reverse(12345);
//		sumOfEven(2,10);
//		nTables(3);
//		if(perfectNumber(625)) {
//			System.out.println("It is  a perfect number");
//		}else {
//			System.out.println("Not a perfect number");
//		}
//		int larger=larger(90,50,40);
//		System.out.println("larger number is : "+larger);	
//		int smaller=smaller(90,10,40);
//		System.out.println("Smaller number is : "+smaller);
//		System.out.println("Count of digits : "+countOfDigits(12345));
//		System.out.println("sum of digits : "+sumOfDigits(12345));
//		if(palindrome(1221)) {
//			System.out.println("it is a palindrome");
//		}else {
//			System.out.println("it is not a palindrome");
//		}
//		System.out.println("Reverse number is : "+reverseNumber(12345));
//		System.out.println("It is a prime number "+ isPrime(91));
//		System.out.println("factorial of a number : "+factorial(6));
		
//		System.out.println("Is this armstrong number "+armstrongNumber(20));

		System.out.println("Strong number is "+strongNumber(15));
	}
}
