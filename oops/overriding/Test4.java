package com.oops.overriding;

class Circle{
	int radius=10;
}

public class Test4 {

	public static void main(String[] args) {
		final Circle c1=new Circle();
		System.out.println(c1);
		System.out.println(c1.radius);
		c1.radius=20;
		System.out.println(c1.radius);
		//c1=null; CTE for final keyword
		//c1=new Circle();
		System.out.println(c1);
	}

}
