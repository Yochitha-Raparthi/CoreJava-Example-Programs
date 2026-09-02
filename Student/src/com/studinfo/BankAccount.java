package com.studinfo;

public class BankAccount {
    static long accNo;
    long accountNumber;
    String accountHolder;
    double balance;{
    	accNo++;
    }
	public static void main(String[] args) {
		
		System.out.println("1st Account Holder ....");
		BankAccount b1=new BankAccount();
		accNo=1234;
		b1.accountNumber=accNo;
		b1.accountHolder="teja";
		b1.balance=3000;
        System.out.println("Account Number : "+b1.accountNumber);
        System.out.println("Account Holder Name : "+b1.accountHolder);
        System.out.println("Account Balance : "+b1.balance);
        System.out.println("\n2nd Account Holder ....");
		BankAccount b2=new BankAccount();
		b2.accountNumber=accNo;
		b2.accountHolder="Uma";
		b2.balance=5000;
        System.out.println("Account Number : "+b2.accountNumber);
        System.out.println("Account Holder Name : "+b2.accountHolder);
        System.out.println("Account Balance : "+b2.balance);
        
	}

}
