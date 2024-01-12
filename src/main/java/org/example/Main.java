package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashFunction hashFunction = new HashFunction();

        String pass = getUserInput("Enter password: ");

        String hash1 = hashFunction.hash(pass);

        System.out.println(pass);
        System.out.println(hash1);
    }

    public static String getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(prompt);
        String input = scanner.nextLine();

        return input;
    }
}

