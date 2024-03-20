package org.example.Project1;

public class Task7 {
    public static void main(String[] args) {

        int totalTerm=10;
        int a=0;
        int b=1;

        for (int i = 1; i <= totalTerm; i++) {
            //System.out.println(i);
            System.out.println(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }

    }
}


//7.	Write a Java Program to print the first 10 numbers of Fibonacci series.