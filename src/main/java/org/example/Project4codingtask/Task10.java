package org.example.Project4codingtask;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//How can you remove all duplicates from ArrayList?
public class Task10 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(15);
        numbers.add(10);
        numbers.add(20);
        numbers.add(17);

        Set<Integer> newNumber = new LinkedHashSet<>(numbers);
        System.out.println(newNumber);
    }
}
