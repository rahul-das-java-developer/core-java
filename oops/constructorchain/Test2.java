package com.oops.constructorchain;

class F {
	int i;
	F(){
		i=10;
	}
}
class G extends F {
	int j;
	G(){
		j=20;
	}
}

public class Test2 {

	public static void main(String[] args) {
		G g1=new G();
		System.out.println(g1.i);
		System.out.println(g1.j);

	}

}
