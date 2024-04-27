package org.example.Project4codingtask;
import java.util.ArrayList;
import java.util.List;
//You have a list of strings and you want to keep only those that start with
//“A” and you want to return them in lower case".
public class Task8 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Animal");
        stringList.add("Cat");
        stringList.add("Animals");
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Animation");
        stringList.removeIf(x-> !x.startsWith("A"));
        String str =  stringList.toString().toLowerCase();
        System.out.println(str);

    }
}
