package org.example.Project4codingtask.Zoom_Eco_System;

public class Lion extends Mammal {
    public Lion(String type, String name, String color, int age, double weight) {
        super(type, name, color, age, weight);
    }

    public void eat() {
        System.out.println("Lion eating meat from hunting and scavenging");
    }

    public void makeSound() {
        System.out.println("Lion sound is roaring");
    }

    public void displayInformation() {
        System.out.println("This Animal type is " + type + " & name is " + name + " & the age is " + age + " & The weight is " + weight);
    }
}