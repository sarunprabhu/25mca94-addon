package core;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// left angled triangle
		System.out.println("Enter the number of rows: ");
		int rows = in.nextInt();

		for (int i = 1; i <=rows; i++) { // 5-1==>4 3 2 1
			/**
			 * space controlling
			 */
			for (int j = i; j <=rows; j++) { // j*1 1<5
				System.out.print("    ");
			}

			/**
			 * star printing
			 */
			for (int k = 1; k <=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		in.close();

	}

}