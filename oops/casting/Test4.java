package com.oops.casting;

class D {
	void m1() {
		System.out.println("m1() of D");
	}
}

class E extends D {
	void m2() {
		System.out.println("m2() of E");
	}
}
class F extends D {
	void m3() {
		System.out.println("m3() of F");
	}
}

public class Test4 {

	public static void main(String[] args) {
		D d1=new E();
		d1.m1();
		// d1.m2();
		
		D d2=new F();
		d2.m1();
		// d2.m2();
		// d2.m3();
		
		
	}

}
