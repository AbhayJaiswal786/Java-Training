package Day_4;

public class Day_4_Class_Work{
    public static void main(String[] args) {
        String S=new String("hello");
        S.concat("World"); //no concatination because string is immutable
        System.out.println(S);

        String new_s;
        new_s=S.concat("World"); //we can take new string to make changes in previous string
        System.out.println(new_s);


        StringBuffer sb=new StringBuffer("hello");
        sb.append("World"); 
        System.out.println(sb);

        String S1=new String("hello");
        String S2=new String("hello");
        System.out.println(S1==S2); //false b/c address of both string different
        System.out.println(S1.equals(S2)); //true ; although .equals is also use for compare string's address reference but in string class, it is overriden and use to compare string context

        StringBuffer Sb1=new StringBuffer("hello");
        StringBuffer Sb2=new StringBuffer("hello");
        System.out.println(Sb1==Sb2); //false ; comparing address's reference of both string , address is diffrent that's why false 
        System.out.println(Sb1.equals(Sb2)); //false ; comparing address of both string , address is diffrent that's why false 


        // by using literal if create string then there will be one object created
        // Example: String S="Hello";

        // but by using new keyword if we create string then there will be two object created
        // Example: String S1=new String("hello");
        // One object will be in heap and other in SCP(String Pool), And if create another string with same context("hello") like String S2=new String("hello"); then in SCP this time no object will be created it point to previous created object in S1.


        StringBuffer Sb3=new StringBuffer("hello");
        StringBuffer Sb4=new StringBuffer("hello");
        String S3="hello";
        String S4="hello";

        // In this above scenario only 3 object will be created 1 in haep and 1 in SCP for Sb3.
        // for Sb4 one will be in heap and in SCP point to previous object created in SCP for Sb3.
        // for S3 n S4 same it will point to object created in SCP for Sb3.
        // Note: Pointing to previous object b/c context of them are same that is "hello";


        final StringBuffer sb5=new StringBuffer("Hello");
        sb5.append("World"); //Final keyword will not make sb3 object constant/immutable because it work for variable not for object.

        System.out.println(sb5);  //HelloWorld


        StringBuffer sb6=new StringBuffer("Abhay");
        // sb3=new StringBuffer("Hey!");  //cannot assign to sb3 b/c sb3 is variable here which is constant by using final keyword.
        sb6=new StringBuffer("Jaiswal");  //can assign here b/c it is not constant .
        System.out.println(sb6);


        // operation of StringBuilder is same as StringBuffer.
        // StringBuffer is thread safe and its objects are synchronized but StringBuilder is thread unsafe and its objects are unsynchronized.


    }
}