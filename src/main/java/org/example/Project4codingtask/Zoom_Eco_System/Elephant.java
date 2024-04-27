package org.example.Project4codingtask.Zoom_Eco_System;

public class Elephant extends Mammal {
    public Elephant(String type, String name, String color, int age, double weight) {
        super(type, name, color, age, weight);
    }

    public void eat() {
        System.out.println("Elephant eating grasses, leaves, shrubs, fruits and roots");
    }

    public void makeSound() {
        System.out.println("Elephant sound is growls");
    }

    public void displayInformation() {
        System.out.println("This Animal type is " + type + " & name is " + name + " & the age is " + age + " & The weight is " + weight);
    }
}