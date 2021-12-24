package com.data.input;

import java.util.Scanner;
public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ob=new Scanner(System.in);
		long a,b;
		float c,d;
		String name;
		System.out.println("enter value of a:");
		a=ob.nextLong();
		
		System.out.println("enter value of b:");
		b=ob.nextLong();
		
		System.out.println("enter value of c:");
		c=ob.nextLong();
		
		System.out.println("enter value of d:");
		d=ob.nextLong();
		
		System.out.println("enter name:");
		name=ob.next();
		
		System.out.println("addition"+(a+b));
		System.out.println("addition"+(c+d));
		System.out.println("name");
		ob.close();
		

	}

}
