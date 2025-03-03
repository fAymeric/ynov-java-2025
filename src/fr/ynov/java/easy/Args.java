package fr.ynov.java.easy;

import java.util.Scanner;

public class Args {
    public static void args() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select two numbers:");
        int a = scanner.nextInt();
        System.out.println("Your first number is: " + a);
        int b = scanner.nextInt();
        System.out.println("Your second number is: " + b);
        System.out.println("You selected " + a + " and " + b);
        System.out.println("Now select an operator between +, -, *, /:");
        switch (scanner.next()) {
            case "+": System.out.println(a + b);break;
            case "-": System.out.println(a - b);break;
            case "*": System.out.println(a * b);break;
            case "/": System.out.println(a / b);break;
        }

    }
}
