package Day_1.Class_Problem;
// Write a program to find number of appearances of a character in string with using loops.

import java.util.HashMap;

public class Question1 {
    public static void main(String[] args) {
        String s="Apple";
        int count=0;
        HashMap<Character,Integer> List=new HashMap<>();

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            List.put(s.charAt(i), count);
        }

        System.out.println(List);
    }

    
}
