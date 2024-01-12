package org.example;


public class HashFunction {

    public static String hash(String input) {
        return generateRandomHash(input);
    }

    private static String generateRandomHash(String input) {
        int originalHash = Math.abs(input.hashCode()); // ser till att det inte är ett negativ tal.
        String lastHash = Integer.toString(originalHash, 32); // konverterar till en string med 32 i längd.

        while (lastHash.length() < 32) {
            lastHash += lastHash; // sätter värdet till sig själv upp till 32 i längd.
        }
        return lastHash.substring(0, 32); // returnerar de 32 första.
    }
}


