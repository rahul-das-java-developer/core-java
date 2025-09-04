package com.oops.inheritance;
class C {
	int i;
}
class D extends C {
	int j;
	void m1() {
		System.out.println(i);	// inherited member
		System.out.println(j);
	}
}

public class Test2 {

	public static void main(String[] args) {
		 D d1=new D();
		 
		 d1.i=10;	// inherited member
		 d1.j=20;
		 d1.m1();

	}

}
