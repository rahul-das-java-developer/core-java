package com.oops.overriding;

class Bank{
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank{
	@Override
	protected int getRateOfInterest() {
		System.out.println("10% interest by SBI");
		return 10;
	}
}

class PNB extends Bank{
	@Override
	int getRateOfInterest() {
		System.out.println("20% interest by PNB");
		return 20;
	}
}

class Axis extends Bank{
	@Override
	public int getRateOfInterest() {
		System.out.println("30% interest by Axis");
		return 30;
	}
}

public class BankDriver {

	public static void main(String[] args) {

		Axis a=new Axis();
		a.getRateOfInterest();
		
		SBI s=new SBI();
		s.getRateOfInterest();
	}

}
