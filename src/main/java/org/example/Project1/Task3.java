package org.example.Project1;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 13, 56,40,72},
                {11, 14, 19,25,90},
                {12, 16, 20,45,88}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j] + " ");
                }
            }
        }
    }
}



//3.Create 2D array of integers type where you will store odd and even numbers.
//        //Develop a program which will identify/print the even numbers only.