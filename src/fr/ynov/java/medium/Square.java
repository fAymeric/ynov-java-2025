package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {
    public static void square(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scanner.nextInt();
        int squareNumber = a * a;
        System.out.println(squareNumber);
    }
}
