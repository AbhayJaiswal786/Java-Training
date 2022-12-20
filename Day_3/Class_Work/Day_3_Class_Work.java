package Day_3.Class_Work;
	// • WAP to remove duplicate characters from string.
	// • WAP to reverse string without using array.
	// Example:
	// Input: "Compare to String"
	// Output: "String to Compare"
	
	// • WAP to replace characters with its occurrences.
	// • Find longest substring without repetition of characters.

class Question{
    String First_Name="Abhay";
    String Last_Name="Jaiswal";

    String Name="Abhay";
    String Name1="Abhay";

    String s1=new String("Abhay");
    String s2=new String("Abhay");
}

class remove_duplicates_characters_from_string{
    String s="abhay";
    
    void do_(){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()-1;j++){
                if(s.charAt(i)==s.charAt(j)){
                    s=s.replace(s.charAt(j), ' ');
                }
            }
        }
        System.out.println(s);
    }
}


public class Day_3_Class_Work{
    public static void main(String[] args) {
        // Question obj=new Question();
        // System.out.println(obj.First_Name+obj.Last_Name);

        // System.out.println("\n"+obj.Name.compareTo(obj.Name1));
        // System.out.println(obj.Name==obj.Name1);
        // System.out.println(obj.Name.equals(obj.Name1));

        
        // System.out.println("\n"+obj.s1.compareTo(obj.s2));
        // System.out.println(obj.s1==obj.s2);
        // System.out.println(obj.s1.equals(obj.s2));


        remove_duplicates_characters_from_string obj1=new remove_duplicates_characters_from_string();

        obj1.do_();



    }
}