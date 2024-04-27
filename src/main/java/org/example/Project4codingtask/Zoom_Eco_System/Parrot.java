package org.example.Project4codingtask.Zoom_Eco_System;

public class Parrot extends Bird{
    public Parrot(String type, String name, String color, int age, double weight) {
        super(type, name, color, age, weight);
    }
    public  void eat(){
        System.out.println("Parrot Eats fresh fruits, vegetables, seeds and nuts");
    }
    public  void makeSound(){
        System.out.println("Parrot sound is screech");
    }
    public  void displayInformation(){
        System.out.println("This Animal type is "+type+" & name is "+name+" & the age is "+age+" & The weight is "+weight);
    }
}
