package org.example.Project4codingtask;
//Reverse a String: Write a function to reverse a given string. For example,
//given the input "Hello", the output should be "olleH".

class reverse {
    public String toReverse(String word) {
        StringBuilder wordToReverse = new StringBuilder(word);
        String newWord = wordToReverse.reverse().toString();
        System.out.println(newWord);
        return newWord;
    }
}


public class Task3 {
    public static void main(String[] args) {
        reverse word = new reverse();
        word.toReverse("Hello");

    }
}
