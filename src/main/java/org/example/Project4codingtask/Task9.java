package org.example.Project4codingtask;
//Find the First Non-Repeating Character in a String: Given a string, find and
//return the first non-repeating character. For example, in the string
//"abracadabra", the first non-repeating character is 'c'.
public class Task9 {
    public static void main(String[] args) {
       String word ="abracadabra";
       char character = ' ';
        for (int i = 0; i <word.length() ; i++) {
            if (word.indexOf(word.charAt(i),word.indexOf(word.charAt(i))+1)==-1){
               character =word.charAt(i);
               System.out.println(character+" is the first Non-Repeating Character in a String");
                break;
            }
        }
    }
}
