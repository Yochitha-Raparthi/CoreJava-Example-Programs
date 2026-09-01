package com.studinfo;
class A{
	B b;
	@Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called");
    }
}
class B{
	A a;
	@Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called");
    }
}
public class GarbageCollector {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called");
    }
    void function() {
    	GarbageCollector g=new GarbageCollector();
    }
    void hello() {
    	 System.out.println("Welcome");
    }
	public static void main(String[] args) {
		GarbageCollector g1=new GarbageCollector();
		GarbageCollector g2=new GarbageCollector();
		System.out.println(g1);
		System.out.println(g2);
		g1=null;
		GarbageCollector g3=new GarbageCollector();
		g3=g2;
	    g3.function();
	    new GarbageCollector().hello();
		System.out.println("After nullfying");
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		A obj1=new A();
		B obj2=new B();
//		obj1.a=obj2;
//		obj2.b=obj1;
		obj2.a=obj1;
		obj1.b=obj2;
		obj1=null;
		obj2=null;
		System.out.println(obj2);
		System.out.println(obj1);
//		System.out.println(obj1.b);
		System.gc();
		
	}

}
