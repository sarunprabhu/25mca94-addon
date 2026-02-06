package core;

import java.util.Scanner;

public class floydtraiangle {

	public static void main(String[] args) {
		
		Scanner sh = new Scanner(System.in);
		int rows=sh.nextInt();
		for(int i=1;i<=rows;i++)
		{
			/**
			 * Space controlling
			 */
			for(int j=i;j<rows;j++)
			{
				//j=1 1<5
				System.out.print("  ");
			}
			/**
			 * Star Printing
			 */
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
sh.close();
	


}}