package org.example.codingtask;

public class T2 {
    public static void main(String[] args) {
        //2.	Create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.
        int []numbers={10,25,35,78,65,98,};
       int sum=0;
        for (int n:numbers){
            sum+=n;
        }
        System.out.println(sum);

    }

}
