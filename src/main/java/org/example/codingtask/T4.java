package org.example.codingtask;

public class T4 {
    public static void main(String[] args) {
        //4.	Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.

        int[][] numbers = {{25, 98, 75, 66, 44, 32}, {10, 15, 25, 35, 50, 60}};
        int evenSum=0;
        int oddSum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    evenSum+=numbers[i][j];
                }if (numbers[i][j]%2!=0){
                    oddSum+=numbers[i][j];
                }
            }
        }System.out.println("The even sum of that arrays is "+evenSum);
        System.out.println("The odd sum of that arrays is "+oddSum);
    }

}
