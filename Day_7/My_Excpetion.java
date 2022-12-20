package Day_7;
// User defined Exception
class MyException extends Exception{
    public MyException(){
    }
    public MyException(String msg){
        super(msg+" Please contact admin!");
    }
}

public class My_Excpetion {
    public static void main(String[] args) {
        int age=9;
        try{
            if(age<18){
                throw new MyException("Age is too small!");
            }
        }
        catch(MyException e){
            System.out.println(e);

        }
    }  
    
}
