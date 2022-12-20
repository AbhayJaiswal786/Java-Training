package Day_6;

class exception_scenarios{
    void case_1(){
        // In this case one exception will be thrown that is Arithmetic Exception
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }

    void case_2(){
        // In this case we are trying to catch two exceptions but only  first one exception will be thrown that is Arithmetic Exception
        try{
            int array[]={2,3};
            System.out.println(10/0);
            System.out.println(array[2]);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }

    void case_3(){
        // In this case we are trying to catch two same exceptions but it is not allowed and it will give error
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

    }

    void case_4(){
        // In this case, first exception will be thrown then everything will be executed properly.
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
            System.out.println("Second try is running");
        }
        finally{
            System.out.println("Exception thorwn , finally running!");
        }

    }

    void case_5(){
        // In this case, it will give error
        try{
            System.out.println(10/0);
        }
    }

    void case_6(){
        // In this case, it will give error
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

    void case_7(){
        // In this case, it will give error
        try{
            int array[]={2,3};
            System.out.println(10/0);
            System.out.println(array[2]);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Hello");
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }

    void case_8(){
        // In this case, give error
        try{
            System.out.println(10/0);
        }
        finally{
            System.out.println("Exception thorwn , finally running!");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

    void case_9(){
        // In this case, it will give error
        try{
            int array[]={2,3};
            // System.out.println(10/0);
            System.out.println(array[2]);
        }
        System.out.println("Hello");
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    void case_10(){
        // In this case, it will give error
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Hello");
        finally{
            System.out.println("finally is running");
        }

    }

    void case_11(){
        // Give error
        try{
            try{
                System.out.println(10/0);
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

    void case_12(){
        // give error
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            finally{
                System.out.println(e);
            }
        }
    }

    void case_13(){
        // In this case, it will give error
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally is running");
        }
        finally{
            System.out.println("finally 2 is running");
        }


    }


}
public class Day_6_Class_Work {
    public static void main(String[] args) {
        // dostuff();
    
    // Activation Record or stack frame and Runtime stack
    // For one thread there is only one runtime stack will be created by JVM.

    // |              |
    // |              |
    // |domorestuff() |
    // | dostuff()    |
    // | main()       |    Runtime Stack 
        
        //Performing 13 Exception Scenarios/cases
        exception_scenarios obj=new exception_scenarios();
        // obj.case_1();
        // obj.case_2();
        // obj.case_3();
        obj.case_4();

    }

    public static void dostuff() {
        domorestuff();            
    }
    public static void domorestuff() {
        System.out.println(10/0);
    }

    // Exception:
    // On occuring exception JVM gives three informations:
       // 1. Name of the exception 
       // 2. Descripton of the exception
       // 3. location at which exception occur

    // Errors are unchecked

    //Throw and Throws
        
}
    
