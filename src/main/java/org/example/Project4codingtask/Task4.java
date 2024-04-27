package org.example.Project4codingtask;
//Check if a String is Palindrome: Determine whether a given string is a
//palindrome, which means it reads the same forwards and backward. For
//example, "madam" is a palindrome

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Please enter word to check");
        Scanner scan = new Scanner(System.in);
        String givenWord = scan.nextLine();
        StringBuilder wordToReverse = new StringBuilder(givenWord);
        String newWord = wordToReverse.reverse().toString();
        if (givenWord.equalsIgnoreCase(newWord)){
            System.out.println(givenWord+" is a palindrome word");
        }else{
            System.out.println(givenWord+" is not a palindrome word");
        }
    }
}
