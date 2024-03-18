package org.example.codingtask;

public class T9 {
    public static void main(String[] args) {
        //9.	Write a java program to find the second largest number in the array?
        int [] numbers={10,520,65,78,400,520,800,900,200};
        int largest=0;
        int secondLargest=0;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]>largest){
                secondLargest = largest;
                largest=numbers[i];
            }else if (largest > numbers[i] && numbers[i] > secondLargest){
                secondLargest = numbers[i];
            }
        } System.out.println("The second Largest number in this array is "+secondLargest);

    }

}