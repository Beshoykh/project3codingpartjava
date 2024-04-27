package org.example.Project4codingtask;
//Create a method to count how many vowels are present in a string
//“documentation

class Count{
    public int ToCountVowel(String word){
        int count=0;
        for (int i = 0; i <word.length() ; i++) {
            char ch = word.charAt(i);
            if (ch=='a'|| ch=='A'||ch=='e'|| ch=='E'||ch=='i'|| ch=='I'||ch=='o'|| ch=='O'||ch=='u'|| ch=='U'){
                count++;
            }
        }
        System.out.println(count);

        return count;
    }
}

public class Task6 {
    public static void main(String[] args) {
        Count word = new Count();
        word.ToCountVowel("documentation");
    }
}
