package core;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		Scanner me=new Scanner(System.in);
		System.out.println("Enter hardness");
		int s=me.nextInt();
		System.out.println("Enter your carbon");
		int a=me.nextInt();
		System.out.println("Enter your tensile");
		int r=me.nextInt();
		if(s>50&&a<0.7&&r>5000)

	}

}
