package org.example.codingtask;

public class T8 {
    public static void main(String[] args) {
        //8.	Maximum and minimum number in the array?
        int [] numbers={10,52,65,78,4,52,36,908,200};
        int max=numbers[0];
        int min=numbers[0];
        for (int n:numbers){
            if (max<n){
                max=n;
            }if (min>n){
                min=n;
            }
        } System.out.println("The Maximum number in this array is "+max);
        System.out.println("The Minimum number in this array is "+ min);

    }

}

