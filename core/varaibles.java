package core;

import java.util.Scanner;


public class varaibles {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//Memory Reservation or Variables declaration
		byte a;
		short b;
		int c;
		long d;
		char e;
		float f;
		double g;
		boolean h;
		System.out.println("Enter the byte:");
		a=in.nextByte();
		System.out.println("Enter the short:");
		b=in.nextShort();
		System.out.println("Enter the int:");
		c=in.nextInt();
		System.out.println("Enter the long:");
		d=in.nextLong();
		System.out.println("Enter the char:");
		e=in.next().charAt(0);
		System.out.println("Enter the float:");
		f=in.nextFloat();
		System.out.println("Enter the double:");
		g=in.nextDouble();
		
		
		//print the output
		System.out.println("Byte"+a);
		System.out.println("short"+b);
		System.out.println("int"+c);
		System.out.println("long"+d);
		System.out.println("char"+e);
		System.out.println("float"+f);
		System.out.println("double"+g);
		

	}

}

