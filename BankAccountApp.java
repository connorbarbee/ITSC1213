//This is a simple practice program for Exam 1.
//Written in Java
//You can use this file to test code snippets or study
// It will feature conditions, variables, loops, methods, classes, and a getter/setter.
// The program will ask the user's income, and provide financial advice.

import java.util.Scanner;

public class BankAccountApp {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Get user input
        System.out.print("What is your name? ");
        String name = s.nextLine();

        System.out.print("Enter your starting balance: ");
        double start = parseMonsey(s.nextLine());

        System.out.print("Enter your monthly income: ");
        double income = parseMonsey(s.nextLine());

        System.out.print("Enter your monthly expenses: ");
        double expenses = parseMonsey(s.nextLine());

        // Build account object (class, constructor, getter/setter demo below)
        BankAccount acct = new BankAccount(name, start);

        // Simple advice based on income and expenses
        double surplus = income - expenses;
        if (surplus <= 0) {
            System.out.println("You are spending more than you earn. Aim to cut 10 percent of expenses.");
        } else if (surplus < income * 0.1) {
            System.out.println("You have a small surplus of income - try saving 5%.");
        } else {
            System.out.println("Great job! You have a healthy surplus of income.");
        }

        // Loop: project 12 months and print each month's balance
        System.out.println("\n12-month projection:");
        for (int month = 1; month <= 12; month++) {
            // deposit surplus each month
            acct.deposit(surplus);

            // simple condition inside loop
            if (acct.getBalance() < 0) {
                System.out.println("Month " + month + ": $" + fmt(acct.getBalance()) + " (Warning: negative balance!)");
            } else {
                System.out.println("Month " + month + ": $" + fmt(acct.getBalance()));
            }
        }

        // Demo of setter/getter (adjusting name neatly)
        acct.setOwner(capitalize(acct.getOwner()));
        System.out.println("\nAccount Owner: " + acct.getOwner());

        s.close();
    }

    // Method: parse a money string like "$1,234.56" or "1234.56" into a double
    // (kept the original name exactly as used above)
    public static double parseMonsey(String input) {
        if (input == null) return 0.0;
        String cleaned = input.trim().replaceAll("[,$]", "");
        try {
            return Double.parseDouble(cleaned);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    // Helper method: capitalize a name (simple version)
    public static String capitalize(String n) {
        if (n == null || n.isEmpty()) return n;
        return n.substring(0, 1).toUpperCase() + n.substring(1);
    }

    // Helper method: format to two decimals
    public static String fmt(double v) {
        return String.format("%.2f", v);
    }
}

// Separate class with fields, constructor, methods, and a getter/setter.
class BankAccount {
    private String owner;
    private double balance;

    // Constructor
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Getter
    public String getOwner() {
        return owner;
    }

    // Setter
    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Another getter
    public double getBalance() {
        return balance;
    }

    // Methods
    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}