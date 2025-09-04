package com.oops.constructorchain;

class A {
	int i=10;
	static void m1() {
		System.out.println("m1() of A");
	}
}
class B extends A {
	int i=20;
	static void m2() {
		System.out.println("m2() of B");
	}
	void m3() {
		super.m1();
		System.out.println(super.i);
		System.out.println(i);
		System.out.println("m3() of B");
	}
}

public class Test {

	public static void main(String[] args) {
		A.m1();
		B b=new B();
		b.m2();
		b.m3();
	}

}
