package com.oops.inheritance;
class AA {
	int i=10;
	int j=20;
}
class BB extends AA {
	void m2() {
		System.out.println("i = "+i+" and j = "+j);	// inherited variable
		
	}
}

public class Demo {

	public static void main(String[] args) {
		BB b=new BB();
		b.m2();

	}

}
