package com.oops.constructorchain;

class C {
	C(){
		System.out.println("Constructor of C");
	}
}
class D extends C {
	D(){
		System.out.println("Constructor of D");
	}
}
class E extends D {
	E(){
		System.out.println("Constructor of E");
	}
}

public class Test1 {

	public static void main(String[] args) {
		new E();

	}

}
