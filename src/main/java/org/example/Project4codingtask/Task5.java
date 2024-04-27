package org.example.Project4codingtask;

import java.util.Arrays;

//Check if Two Strings are Anagrams: Given two strings, determine if they
//are anagrams, meaning they contain the same characters in a different order.
//For example, "listen" and "silent" are anagrams

public class Task5 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] a =str1.toCharArray();
        char[] b =str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        String sortedA = Arrays.toString(a);
        String sortedB = Arrays.toString(b);

        if (sortedA.equals(sortedB)){
            System.out.println("AnaGram");
        }else{
            System.out.println("Not");
        }


    }
}