package com.oops.has_a;

public class Theater {
	private int seats=50;
	private static Theater t;
	private Theater() {
		
	}

	public static Theater getIns() {
		// factory method
		if(t== null) {
			t=new Theater();
			return t;
		}
		return t;
	}
	public void bookTicket(int n) {
		if(n<=seats) {
			seats-=n;
			System.out.println(n+" seats is booked.");
		}
		else {
			System.out.println(seats+" seats are available");
		}
	}

}
