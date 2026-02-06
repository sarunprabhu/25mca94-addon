package core;

import java.util.Scanner;

public class pattren19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size for heart shape(6 to 12): ");
		
		int rows = in.nextInt();
		
		for(int i= rows/2; i <= rows; i+=2) {
			//print first spaces
			for(int j = 1; j < rows-i; j+=2) {
				System.out.print("  ");
			}
			//print first star
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			//print second spaces
			for(int j = 1; j <= rows-i; j++) {
				System.out.print("  ");
			}
			//print second star
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = rows; i >= 1; i--) {
			//print spaces
			for(int j = i; j < rows; j++) {
				System.out.print("  ");
			}
			//print star
			for(int k = 1; k <= 2*i-1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		in.close();
	}

}