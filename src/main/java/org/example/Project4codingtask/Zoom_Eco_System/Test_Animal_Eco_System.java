package org.example.Project4codingtask.Zoom_Eco_System;

public class Test_Animal_Eco_System {
    public static void main(String[] args) {
        Animal[] allAnimals = {
                new Lion("Lion", "Lolo", "Brown", 5, 120.0),
                new Elephant("Elephant", "Fofo", "Gray", 7, 250.00),
                new Parrot("Parrot", "Parry", "Blue", 5, 5.00),
                new Eagle("Eagle", "Horr", "White X Golden", 8, 22.0)};

         for(Animal a:allAnimals){
             a.eat();
         }
        System.out.println("**************************");
         for(Animal a:allAnimals){
             a.makeSound();
         }
        System.out.println("**************************");
        for(Animal a:allAnimals){
            a.sleep();
        }
        System.out.println("**************************");
        for(Animal a:allAnimals){
            a.displayInformation();
        }
    }
}
