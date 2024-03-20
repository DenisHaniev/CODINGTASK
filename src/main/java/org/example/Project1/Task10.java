package org.example.Project1;

public class Task10 {
    public static void main(String[] args) {
        String[] name = {"Lana", "Ana", "Maggy", "Denis", "James","Ana","maggy"};
        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[i].equalsIgnoreCase(name[j])) {
                    System.out.println("Duplicate element: "+name[j]);

                }
            }
        }
    }
}



//10.Write a program to print out duplicate elements from an Array of Strings?