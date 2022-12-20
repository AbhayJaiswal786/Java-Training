// calculate the number and percentage of lowercase letter, uppercase letter, digits and other special character in string  
package Day_1.Class_Problem;
public class Question2 {
    public static void main(String[] args) {
        String s="Abhay123@";
        int lc=0;
        int uc=0;
        int dig=0;
        int spec=0;


        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                lc++;
            }

            if(Character.isUpperCase(s.charAt(i))){
                uc++;
            }

            if(Character.isDigit(s.charAt(i))){
                dig++;
            }

            if(Character.isSpaceChar(s.charAt(i))){
                spec++;
            }
            
        }

        System.out.println(lc);
        System.out.println(uc);
        System.out.println(dig);
        System.out.println(spec);

    }
    
}
