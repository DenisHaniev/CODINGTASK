package org.example.Project1;

public class Task4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 13, 56, 40, 72},
                {11, 14, 19, 25, 90},
                {12, 16, 20, 45, 88}
        };
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    sum += numbers[i][j];
                } else if (numbers[i][j] % 2 != 0) {
                    sum1 += numbers[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers is " + sum);
        System.out.println("The sum of the odd numbers is " + sum1);
    }
}




//4.Create a 2D array of integers.
// Develop a program which will calculate the sum of  even and odd numbers for that array.