package com.oops.methodObjArg;

public class BookShop {

	public static void main(String[] args) {
		Book b1=BookCreator.createBook();
		Book b2=BookCreator.createBook();
		
		b1.display();
		b2.display();

	}

}
