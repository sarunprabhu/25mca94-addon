package pattern;
import java.util.Scanner;
public class leftstar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many rows:");
		int rows=sc.nextInt();
		
		//upper half
		for(int i=1;i<=rows;i++)
		{
			//left star
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			//middle space
			for(int j=1;j<=2*(rows-i);j++)
			{
				System.out.print("  ");
			}
			
			//right star
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
	}
		
		//lower half
		for(int i=rows-1;i>=1;i--)
		{ //5-1
			//left star
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			//middle space
			for(int j=1;j<=2*(rows-i);j++)
			{
				System.out.print("* ");
			}
			//right star
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}