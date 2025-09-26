package com.pluralsight;

import java.util.Scanner;

public static void main(String[] args) {
    public static void presentValueOrdinaryAnnuity() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Monthly Payout (PMT): ");
        double monthlyPayout = scan.nextDouble();
}







public class main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println()
    System.out.print("Option");
    int (option )
    }
}

public static void mortgageCalculator() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter Loan Amount: ");
    double loanAmount = scan.nextDouble(); // Principal (p)

    System.out.print("Enter Interest Rate: ");
    double interestRate = scan.nextDouble() / 100; // interest rate (r)

    System.out.print("Enter Loan Length (in years): ");
    int loanLengthInYears = scan.nextInt(); // Loan length in years (y)

    int numberOfMonthlyPayments = 12 * loanLengthInYears; // Number of Monthly Payments (n)

    double monthlyInterestRate = interestRate / 12; // Monthly Interest Rate (i)

    // M = P × ( i × (1 + i)^n ) / ( (1 + i)^n – 1 )
    double monthlyPayment = loanAmount *
            (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments))
            / (Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments) - 1);

    double totalInterest = (monthlyPayment * numberOfMonthlyPayments) - loanAmount;

    System.out.printf("Monthly Payment: $%.2f, Total Interest: $%.2f",
            monthlyPayment, totalInterest);




}