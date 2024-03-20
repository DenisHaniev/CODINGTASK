package org.example.Project1;

public class Task11 {
    public static void main(String[] args) {
        String[] array = {"23", "56", "98", "23", "59", "22"};
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is a duplicate
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    // Print the duplicate element
                    System.out.println("Duplicate element: " + array[i]);
                }
            }
        }
    }
}



//10.Write a program to print out duplicate elements from an Array of Strings?