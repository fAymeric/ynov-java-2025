package fr.ynov.java.easy;

import java.util.Scanner;

public class EvenOrOdd {
    public static void compare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int b = scanner.nextInt();
        if (b % 2 == 0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
