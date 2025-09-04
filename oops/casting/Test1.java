package com.oops.casting;

class A {
	
}

class B extends A{
	
}
class C extends A{
	
}


public class Test1 {
	public static void main(String[] args) {
		A a1=new B(); 	// Auto upcasting
		A a2=new C();	// Auto upcasting
		
		System.out.println(a2 instanceof C);
		System.out.println(a2 instanceof B);
		System.out.println(a2 instanceof A);
		System.out.println(a2 instanceof Object);

		
	}
}
