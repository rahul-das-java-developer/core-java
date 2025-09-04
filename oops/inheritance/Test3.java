package com.oops.inheritance;

class E {
	int i=10;
	int j=20;
}
class F extends E {
	
	int i=30;
	int j=40;
	
	void m2() {
		System.out.println("i = "+i+" and j = "+j);	
		System.out.println("Super class i = "+super.i+" and Super class j = "+super.j);	// inherited variable
		
	}
}

class G extends F {
	
	int i=50;
	int j=60;
	
	void m3() {
		super.m2();
		System.out.println("i = "+i+" and j = "+j);	
		System.out.println("Super class i = "+super.i+" and Super class j = "+super.j);	// inherited variable
		
	}
}


public class Test3 {

	public static void main(String[] args) {
		G g1=new G();
		g1.m3();

	}

}
