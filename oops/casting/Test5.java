package com.oops.casting;
import java.util.Scanner;
class Vegetable {
	
}
class Carrot extends Vegetable{
	void cookCarrot() {
		System.out.println("Halwa is ready.");
	}
	
}
class Potato extends Vegetable{
	void cookPotato() {
		System.out.println("Fries are ready...");
	}
}
class VegShop{
	
	Vegetable sell() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Select a Vegetable between Carrot and Potato: ");
		String v=scn.next();
		v=v.toLowerCase();
		
		Vegetable veg=null;
		
		if(v.equals("carrot")) {
			veg=new Carrot();
			System.out.println("Carrot is selected");
		}
		else if(v.equals("potato")) {
			veg=new Potato();
			System.out.println("Potato is selected");
		}
		return veg;
	}
}



public class Test5 {

	public static void main(String[] args) {
		VegShop shop=new VegShop();
		Vegetable veg=shop.sell();
		
		if(veg instanceof Carrot) {
			Carrot c1=(Carrot)veg;
			c1.cookCarrot();
		}
		else if(veg instanceof Potato) {
			Potato p1=(Potato)veg;
			p1.cookPotato();
		}
	}

}
