package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name :  ");
        String name = scanner.next();
        System.out.println("Welcome "+name);
    }
}
