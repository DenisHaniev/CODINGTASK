package org.example.Project1;

public class Task8 {
    public static void main(String[] args) {

        int[] array =new int[] {5, 2, 9, 1, 20, 4};

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
    }
}


//8.	Maximum and minimum number in the array?