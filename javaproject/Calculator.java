package javaproject;

public class Calculator {

    public static double calculateTotal(Person[] persons) {
        double total = 0;
        for (Person p : persons) {
            total += p.getPaidAmount();
        }
        return total;
    }

    public static void showSettlement(Person[] persons) {
        double total = calculateTotal(persons);
        double share = total / persons.length;

        System.out.println("\nTotal Expense = ₹" + total);
        System.out.println("Each Person Share = ₹" + String.format("%.2f", share));

        System.out.println("\nSettlement Details:");
        for (Person p : persons) {
            double balance = p.getPaidAmount() - share;

            if (balance > 0) {
                System.out.println(p.getName() +
                        " should RECEIVE ₹" + String.format("%.2f", balance));
            } else if (balance < 0) {
                System.out.println(p.getName() +
                        " should PAY ₹" + String.format("%.2f", -balance));
            } else {
                System.out.println(p.getName() + " is SETTLED");
            }
        }
    }
}
