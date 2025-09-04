package com.oops.has_a;

public class BookMyShow {

	public static void main(String[] args) {
		Theater user1=Theater.getIns();
		user1.bookTicket(25);
		Theater user2=Theater.getIns();
		user2.bookTicket(20);
		Theater user3=Theater.getIns();
		user3.bookTicket(10);
		
		

	}

}
