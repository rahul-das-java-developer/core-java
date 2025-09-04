package com.oops.methodObjArg;
class Emp {
	
	int i;
	
	Emp (int i) {
		this.i=i;
		
	}
	Emp (Emp e) {
		System.out.println("Emp(Emp e) constructor.");
	}
}


public class Test2 {

	public static void main(String[] args) {
		Emp e1=new Emp(10);
		Emp e2=new Emp(e1);
		
		System.out.println(e1.i);
		System.out.println(e2.i);

	}

}
