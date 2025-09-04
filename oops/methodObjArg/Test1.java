package com.oops.methodObjArg;

class A
{
	void m1(int i) {
		System.out.println("m1(int i) of A: "+i);
	}
	void m2(B b) {
		System.out.println("m2(B b) of A: ");
	}
}
class B {
	void m1(int i) {
		System.out.println("m1(int i) of B: "+i);
	}
	void m2(A a) {
		System.out.println("m2(A a) of B: ");
	}
}


public class Test1 {

	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		
		a1.m1(20);
		a1.m2(b1);
		
		System.out.println("----------------------");
		
		b1.m1(50);
		b1.m2(a1);

	}

}
