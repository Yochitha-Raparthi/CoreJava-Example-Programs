package com.javafundamentals;

public class BankAccount {

	int accNumber;
	String cusName;
	String accType;
	int balance;
	BankAccount(int accNumber, String cusName,String accType,int balance){
		this.accNumber=accNumber;
		this.cusName=cusName;
		this.accType=accType;
		this.balance=balance;
	}
	void display() {
		System.out.println("Account number : "+accNumber);
		System.out.println("Customer Name : "+cusName);
		System.out.println("Account Type : "+accType);
		System.out.println("Account balance : "+balance);
	}
	public static void main(String[] args) {
		BankAccount b1=new BankAccount(101,"teja","savings",2000);
		BankAccount b2=new BankAccount(102,"naveen","current",3000);
		b1.display();
		System.out.println("2nd Account holder details ");
		b2.display();
	}

}
