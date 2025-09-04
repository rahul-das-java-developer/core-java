package com.oops.overriding;

class M{
	static void m1() {
		System.out.println("m1() of-A");
	}
}
class N extends M {
	// Method Hiding
	static void m1() {
		System.out.println("m1() of-B");
	}
}

public class MethodHiding {
	public static void main(String[] args) {
		N n1=new N();
		n1.m1();
	}
}
