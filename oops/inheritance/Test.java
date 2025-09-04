package com.oops.inheritance;

class Animal {
	void eat() {
		System.out.println("Eating");
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("Barking Sound");
	}
}
class BabyDog extends Dog{
	void weep() {
		System.out.println("Weeping...");
	}
}
class Cat extends Animal {
	void sound() {
		System.out.println("Mewoing..");
	}
}


public class Test {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		//a.bark();	CTE
		
		Dog d=new Dog();
		d.eat();
		d.bark();
		//d.weep();	CTE
		
		BabyDog b=new BabyDog();
		b.eat();
		b.bark();
		b.weep();
		//b.sound();	CTE (No Is-A relationship between Cat and BabyDog)
		
		Cat c=new Cat();
		c.eat();
		c.sound();

	}

}
