package com.oops.casting;

class Car{
	
}
class BMW extends Car{
	
}
class Audi extends Car{
	
}
class Driver{
	void drive(Car c) {
		System.out.println("Drive() is executed");
	}
}

public class Test2 {
	public static void main(String[] args) {
		Driver d = new Driver();
		d.drive(new Audi());
		d.drive(new BMW());
		d.drive(null);
		
	}
}
