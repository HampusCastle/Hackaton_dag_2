package org.example;


public class HashFunction {

    public static String hash(String input) {
        return generateRandomHash(input);
    }

    private static String generateRandomHash(String input) {
        int originalHash = Math.abs(input.hashCode()); // Computes the hash code of the input and ensures it's non-negative.
        String lastHash = Integer.toString(originalHash, 32); // Converts the hash code to a base-32 string.

        while (lastHash.length() < 32) {
            lastHash += lastHash; // Appends the current hash to itself until the string is at least 32 characters long.
        }

        return lastHash.substring(0, 32); // Returns the first 32 characters of the resulting string.
    }
}


