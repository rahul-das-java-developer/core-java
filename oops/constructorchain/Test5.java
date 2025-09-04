package com.oops.constructorchain;

class H {
	static {
		System.out.println("Static block in H");
	}
	
	{
		System.out.println("Non-static block in H");
	}
	
	H() {
		System.out.println("Zero agr constructor in H");
	}
}

class I extends H {
	static {
		System.out.println("Static block in I");
	}
	
	{
		System.out.println("Non-static block in I");
	}
	
	I() {
		System.out.println("Zero agr constructor in I");
	}
}

public class Test5 {

	public static void main(String[] args) {
		new H();
		System.out.println("--------------------");
		new I();

	}

}
