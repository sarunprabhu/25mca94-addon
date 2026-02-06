package core;

import java.util.Scanner;

public class biodata {

	public static void main(String[] args) {
	Scanner you=new Scanner(System.in);
	String Name;
	int age;
	String Gender;
	String address;
	int Pincode;
	
	System.out.print("Enter your Name:");
	Name=you.nextLine();
	System.out.print("Enter your Age:");
	age = you.nextInt();
	you.nextLine();
	System.out.println("Enter your Gender:");
	Gender=you.nextLine();
	System.out.println("Enter your Address:");
	address=you.nextLine();
	
	System.out.println("Enter your Pincode:");
	Pincode=you.nextInt();
	
	
	
	System.out.println("My Name is:"+Name);
	System.out.println("I'm"+age+"Years old");
	System.out.println("Gender is:"+Gender);
	System.out.println("Address:"+address);
	System.out.println("Pincode:"+Pincode);

	


	}

}
