package org.example.codingtask;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        //6.	Write a java program to check whether a given number is prime or not?
       Scanner scan =new Scanner(System.in);
        System.out.println("Please enter number to check whether is prime or not ");
        int number=scan.nextInt();
        int count=0;
        for (int i=1; i<=number; i++){
            if (number%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }






    }

}

