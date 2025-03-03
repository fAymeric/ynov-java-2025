package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your name: " + name);
        System.out.println("Your age: " +age);
    }
}
