package org.example.Project4codingtask;
//Find out how many alpha characters are present in a string?
public class Task2 {
    public static void main(String[] args) {
        String word="ASDF45*&^%GHfgdtrg^&*gfd";
        int count=0;
       String w = word.replaceAll("[^a-zA-Z]","");
        for (int i = 0; i <w.length() ; i++) {
            count++;
        }
        System.out.println(count);
    }
}
