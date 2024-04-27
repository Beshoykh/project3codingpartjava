package org.example.Project4codingtask.Zoom_Eco_System;

public  abstract class Animal implements AnimalBehavior{
    public abstract void eat();
    public void sleep(){
        System.out.println("Most of the animals are sleep 8-14 hours a day");
    }
    public abstract void makeSound();
    public abstract void displayInformation();
}
