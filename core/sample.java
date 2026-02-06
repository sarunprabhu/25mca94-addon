package core;
import java.util.Scanner;
public class sample {

	public static void main(String[] args) {

Scanner in =new Scanner(System.in);
System.out.println("Enter the value:");

int rows = in.nextInt();
int number =1;
for(int i=1; i<=rows; i++) {
	for(int j=1; j<=rows; j++) {
		System.out.print(number+" ");
		number++;
	}
	System.out.println();
}
in.close();
	}

}