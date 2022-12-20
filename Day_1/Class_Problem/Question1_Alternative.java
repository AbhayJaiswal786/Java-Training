package Day_1.Class_Problem;
// Write a program to find number of appearances of a character in string without using loops.
public class Question1_Alternative {
    public static void main(String[] args) {
        String s="Aptitude";
        int len_s=s.length();

        s=s.replace("t","" );

        int len_new_s=s.length();

        int occurence=len_s-len_new_s;

        System.out.println(s+": "+occurence);
    }
    
}
