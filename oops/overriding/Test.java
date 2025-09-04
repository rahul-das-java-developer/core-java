package com.oops.overriding;

class AA{
	void m1() {
		System.out.println("m1() of AA");
	}
}

class BB extends AA{
	@Override
	void m1() {
		super.m1();
		System.out.println("m1() of BB");
	}
}

class CC extends BB{
	@Override
	void m1() {
		super.m1();
		System.out.println("m1() of CC");
	}
}

public class Test {

	public static void main(String[] args) {
			new CC().m1();
			
	}

}
