package org.example.Project4codingtask;
//Count the Number of Words in a String: Write a function to count the
//number of words in a given string. Words are separated by spaces or
//punctuation. For example, the input "Hello, world!" should return 2
class countString {
    public int toCountStrings (String word){
        String[] wordArray = word.split("[#@%^&*()/ ,]");
        int counter = wordArray.length;
        System.out.println(counter);
        return counter;
    }
}
public class Task7 {
    public static void main(String[] args) {
      countString string = new countString();
        string.toCountStrings("Hello world!");
    }
}
