package javaproject;

import java.util.Scanner;

public class Travelexpense {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of persons.");
            sc.close();
            return;
        }

        sc.nextLine(); 

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of person " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter amount paid by " + name + ": ");
            double amount = sc.nextDouble();
            sc.nextLine();

            persons[i] = new Person(name, amount);
        }

        Calculator.showSettlement(persons);
        sc.close();
    }
}
