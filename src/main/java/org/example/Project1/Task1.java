package org.example.Project1;

public class Task1 {
    public static void main(String[] args) {
        int[] temp = new int[]{60, 20, 25, 32, 18, 0};
        int high = temp[0];
        for (int num : temp) {
            if (high < num) {
                high = num;
            }
        }
        int low = temp[0];
        for (int num : temp) {
            if (low > num) {
                low = num;
            }
        }
        System.out.println("The highest temp for the week is " + high);
        System.out.println("The lowest temp for the week is " + low);
    }
}



//1.	Create a program that uses an array to store a list of temperatures for a week 60,20,25,32,18,0,
// and then uses a loop to find the highest and lowest temperature for the week.