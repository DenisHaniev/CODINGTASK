package org.example.Project1;

public class Task9 {
    public static void main(String[] args) {

        int[] array = new int[]{11, 2, 90, 1, 20, 4};

        int first = array[0];
        int second = array[0];


        for (int i = 0; i < array.length; i++) {
            if (array[i] > first) {
                first = array[i];
            }
            if (first> array[i] && array[i] > second) {
                second =array [i];
            }
        }
        System.out.println("The Second Largest Number in This Array is " + second);
        }
    }


//9.Write a java program to find the second largest number in the array?