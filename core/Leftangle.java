package core;

import java.util.Scanner;

public class Leftangle {

	public static void main(String[] args) {
		Scanner sh=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=sh.nextInt();
		for(int i=rows;i>=1;i--)
		{
			for(int j=rows;j<i;j--)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		sh.close();

	}

}
