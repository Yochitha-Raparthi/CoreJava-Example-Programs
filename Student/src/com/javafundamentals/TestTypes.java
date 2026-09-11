package com.javafundamentals;
import java.math.BigInteger;
import java.math.BigDecimal;
public class TestTypes {
	String str;
	BigInteger b1=new BigInteger("1000");//equals
	BigInteger b2=new BigInteger("1000");
	
	BigDecimal d1=new BigDecimal("100");//equals
	BigDecimal d2=new BigDecimal("100");
	
	
	Integer i1=new Integer("100");//equals
	Integer i2=new Integer("100");
	
	Short s=10;// == and equals
	Short s2=10;
	Short s1=new Short("10");//equals
	Short s3=new Short("10");
	
	Byte b=15;// == equals
	Byte b3=15;
	Byte by1=new Byte("15");//equals
	Byte by2=new Byte("15");
	
	Long l=127l;//equals
	Long l1=new Long("200");
	Long l2=127l;
	
	Float f3=new Float(10);//equals
	Float f4=new Float(10);
	Double do1=100d;//equals
	Double do2=100d;
	Double f= 123456.789;
	public static void main(String[] args) {
		
		TestTypes test=new TestTypes();
//		System.out.println(test.b1);
//		System.out.println("\n"+test.d1);
//		System.out.println("\n"+test.d2);
//		System.out.println("\n"+test.i);
//		System.out.println("\n"+test.i1);
//		System.out.println("\n"+test.s);
//		System.out.println("\n"+test.b);
//		System.out.println("\n"+test.l);
		
		Float f1=100f;//equals
		Float f2=100f;
		Integer i=100;//== and equals
		Integer i3=100;
		System.out.println(f1==f2);
		System.out.println(i==i3);
        System.out.println(test.do1.equals(test.do2));
        
        System.out.println("\n"+f1);
        System.out.println("\n"+test.do1);
        
        System.out.println(test.l==test.l2);
        //long,double
        Character c=128;
        Character c1=128;
        System.out.println(c==c1);        //some datatypes like long and double and float are not working the == operator 
//        Double do1=100d;
//      	Double do2=100d;  also gives false 
//        only working the .equals method
	}

}
