package com.oops.overriding;

class Phone {
	String model;
	String color;
	int displaySize;
	Phone(String m, String c, int d){
		model=m;
		color=c;
		displaySize=d;
	}
	void display() {
		System.out.println("Phone model: "+model);
		System.out.println("Phone color: "+color);
		System.out.println("Phone Display Size: "+displaySize+"cm");
	}
}

class CameraPhone extends Phone{
	int pixel;
	CameraPhone (String m,String c,int d, int p){
		super(m, c, d);
		pixel=p;
		
	}
	void display() {
		super.display();
		System.out.println("Phone camera Pixel: "+pixel+"mp");
	}
}

public class Test3 {

	public static void main(String[] args) {
		CameraPhone cp=new CameraPhone("Realme P1 5G","Aqua",16,48);
		cp.display();

	}

}
