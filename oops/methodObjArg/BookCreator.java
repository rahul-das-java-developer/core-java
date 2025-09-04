package com.oops.methodObjArg;
import java.util.Scanner;
public class BookCreator {
	public static Book createBook()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter book Title :");
		String t=scn.nextLine();
		System.out.println("Enter book Author name :");
		String a=scn.nextLine();
		System.out.println("Enter book Price :");
		double p=scn.nextDouble();
		
		return new Book(t,a,p);
	}
}
