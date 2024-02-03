package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the program that allows to verify your BMI.\n" +
                "If You want to start, please type \"start\", otherwise, please type \"exit\".");
        while(true) {
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("exit")) {
                break;
            } else if (choice.equalsIgnoreCase("start")) {
                System.out.println("Could You please type Your height in meters?");
                double heighInput = scanner.nextDouble();
                System.out.println("Could You please type Your weight in kilograms?");
                double heighWeight = scanner.nextDouble();
                double BMIResult = heighWeight / Math.pow(heighInput, 2);
                System.out.printf("Your BMI is %f\n", BMIResult);
                break;
            } else {
                System.out.println("Please type valid command.");
            }
        }
        scanner.close();

    }

}

