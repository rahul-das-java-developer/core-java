package com.oops.casting;
import java.util.Scanner;

class Vegetable1{
	
}
class Carrot1 extends Vegetable1{
	
}
class Potato1 extends Vegetable1{
	
}
class VegShop1{
	Vegetable1 sell() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a vegetable: ");
		String v=scn.nextLine();
		v=v.toLowerCase();
		
		Vegetable1 veg=null;
		
		if(v.equals("carrot")) {
			veg=new Carrot1();
			System.out.println("Carrot is selected");
		}
		else if(v.equals("potato")) {
			veg=new Potato1();
			System.out.println("Potato is selected");
		}
		return veg;
	}
}

public class Test3 {
	public static void main(String[] args) {
		VegShop1 shop=new VegShop1();
		Vegetable1 veg=shop.sell();
		
		// Use the veg for further use.....
	}
}
