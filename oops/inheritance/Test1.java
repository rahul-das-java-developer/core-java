package com.oops.inheritance;
class A	// Super class
{
	void m1() {
		System.out.println("m1() in A");
	}
}
class B extends A	// Sub class
{
	void m2() {
		System.out.println("m2() in B");
	}
}


public class Test1 {

	public static void main(String[] args) {
		B b1=new B();
		b1.m1();	// inherited member
		b1.m2();

	}

}
