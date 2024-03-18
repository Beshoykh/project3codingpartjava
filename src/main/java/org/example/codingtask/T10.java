package org.example.codingtask;

public class T10 {
    public static void main(String[] args) {
        //10.Write a program to print out duplicate elements from an Array of Strings?
        String [] names={"Beshoy","Anthony", "Austin", "Marlin","Beshoy","Austin","Matt","Fouad", "Marlin","Anthony", "Tom"};
        for (int i=0; i<names.length; i++){
            for (int j=i+1; j<names.length; j++){
                if (names[i].equals(names[j])){
                    System.out.println(names[j]);
                }
            }
        }

    }
}

