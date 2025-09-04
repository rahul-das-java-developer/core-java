package com.oops.overriding;

class A {
	void m1() {
		System.out.println("m1 impl in A");
	}
}
class B extends A {
	void m1() {
		System.out.println("m1 impl in B");
	}
}

public class Test1 {

	public static void main(String[] args) {
		B b1=new B();
		b1.m1();

	}

}
