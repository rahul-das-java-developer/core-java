package com.oops.constructorchain;

class Human {
	String name;
	Human (String n){
		name=n;
	}
}
class Doctor extends Human {
	String sp;
	Doctor (String n, String s) {
		super(n);
		sp=s;
	}
}

public class Test3 {

	public static void main(String[] args) {
		Doctor d=new Doctor("Dr. Rahul","Dentist");
		System.out.println(d.name);
		System.out.println(d.sp);

	}

}
