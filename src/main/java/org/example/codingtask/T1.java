package org.example.codingtask;

public class T1 {
    public static void main(String[] args) {
        //1.	Create a program that uses an array to store a list of temperatures for a week, and then uses a loop to find the highest and lowest temperature for the week.
        int[] temp=new int[7];
        temp[0]=50;
        temp[1]=51;
        temp[2]=52;
        temp[3]=53;
        temp[4]=60;
        temp[5]=47;
        temp[6]=40;
        int highTemp=temp[0];
        int lowTemp=temp[0];
        for (int t:temp){
            if (highTemp<t){
                highTemp=t;
            }else if (lowTemp>t){
                lowTemp=t;
            }
        } System.out.println(" The highest temperature day is " +highTemp);
          System.out.println(" The lowest temperature day is " +lowTemp);

    }
}
