package org.example.codingtask;

import java.util.Scanner;

public class T7A {
    public static void main(String[] args) {
        //7.	Write a Java Program to print the first 10 numbers of Fibonacci series.
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter till what numbers you need to get Fibonacci Series");
        int ser=scan.nextInt();
        int firstNumber=0;
        int secondNumber=1;
        System.out.println("Fibonacci Series till " +  ser +" numbers is ");
        for (int i=1; i<ser; i++){
            System.out.print(firstNumber + " ,");
            int nextNumber= firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextNumber;

        }

    }

}

