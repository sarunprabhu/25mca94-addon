package javaproject;

public class Person {

    private String name;
    private double paidAmount;

    public Person(String name, double paidAmount) {
        this.name = name;
        this.paidAmount = paidAmount;
    }

    public String getName() {
        return name;
    }

    public double getPaidAmount() {
        return paidAmount;
    }
}

