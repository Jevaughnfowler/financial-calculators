package com.pluralsight;

import java.util.Scanner;

public class Calculators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Prompt the user for what calculator they would like to use and list the option
        System.out.println("What Calculator would you like to use?");
        System.out.println("Please choose from the following Options.");
        System.out.println("A: Mortgage \nB: Future Value \nC: Present Value ");


        String choice = scanner.nextLine();


        if(choice.equals ("A")){
            System.out.println("You Choose Mortgage Calculator!");
        }else if (choice.equals ("B")){
            System.out.println("You Choose Future Value Calculator!");
        }else if (choice.equals ("C")){
            System.out.println("You Choose Present Value Calculator!");
        }else{
            System.out.println("Invalid input please try again");
            scanner.next();
        }

        //Building the different types of calculators after interaction
        // A: Mortgage
        System.out.println("Please fill out the following " +
                "\nMonthly Payment " +
                "\nPrincipal " +
                "\nAnnual Interest Rate(APR) " +
                "\nLoan Years \n" );

        System.out.println("Enter The Following \n");

        System.out.println("Principal-What is the amount? eg.(300,000)");
        int principal = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Annual Interest Rate(APR) eg.(3.20)");
        float apr = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Loan Years-How many years is the loan For eg.(15 years etc)");
        int yearsOfLoan = scanner.nextInt();
        scanner.nextLine();

        //Calculate output for mortgage


        double monthlyRate = apr / 100 / 12;
        int totalPayments = yearsOfLoan * 12;

        double monthlyPayment = principal * (monthlyRate * Math.pow(1 + monthlyRate, totalPayments)) /
                (Math.pow(1 + monthlyRate, totalPayments) - 1);

        System.out.println("Monthly Payment is: $" + String.format("%.2f", monthlyPayment));











    }
}