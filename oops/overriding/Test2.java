package com.oops.overriding;

class Animal {
	void move() {
		System.out.println("Running impl");
	}
}

class Snake extends Animal {
	@Override
	void move() {
		System.out.println("Crawling impl");
	}
}

public class Test2 {
	public static void main(String[] args) {
		Snake s=new Snake();
		s.move();
	}

}
