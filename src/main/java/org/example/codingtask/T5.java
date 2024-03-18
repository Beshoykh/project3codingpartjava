package org.example.codingtask;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        //5.	Write a program to swap 2 numbers without a temporary variable?
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number 1 to swap");
        int a=scan.nextInt();
        System.out.println("please enter number 2 to swap");
        int b=scan.nextInt();
        int tem;
        tem=a;
        a=b;
        b=tem;
        System.out.println("Number 1 after swap is " +a);
        System.out.println("Number 2 after swap is " +b);
    }

}

