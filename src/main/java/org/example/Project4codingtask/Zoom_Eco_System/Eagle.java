package org.example.Project4codingtask.Zoom_Eco_System;

public class Eagle extends Bird{
    public Eagle(String type, String name, String color, int age, double weight) {
        super(type, name, color, age, weight);
    }
    public  void eat(){
        System.out.println("Eagle Eats fish as their primary food");
    }
    public  void makeSound(){
        System.out.println("Eagle sound is  whistling");
    }
    public  void displayInformation(){
        System.out.println("This Animal type is "+type+" & name is "+name+" & the age is "+age+" & The weight is "+weight);
    }
}
