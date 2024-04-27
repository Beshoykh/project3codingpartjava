package org.example.Project4codingtask.Zoom_Eco_System;

public class Bird extends Animal{
    protected String type;
    protected String name;
    protected String color;
    protected int age;
    protected double weight;

    public Bird(String type, String name, String color, int age, double weight) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public  void eat(){
        System.out.println("Bird are eating");
    }
    public  void makeSound(){
        System.out.println("Bird are making cute sound");
    }
    public  void displayInformation(){
        System.out.println("This Animal type is "+type+" & name is "+name+" & the age is "+age+" & The weight is "+weight);
    }
}
