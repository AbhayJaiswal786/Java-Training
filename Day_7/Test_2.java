package Day_7;
//test throws
public class Test_2 {
    public int divide_num(int m,int n) throws ArithmeticException{
        int div=m/n;
        return div;
    }

    public static void main(String[] args) {
        Test_2 obj=new Test_2();
        try{
            System.out.println(obj.divide_num(50, 0));
        }

        catch(ArithmeticException e){
            System.out.println("Number cannot be divided by 0");
        }
        System.out.println(10/0);  //it will give Arithmetic exception /0 automatically
        throw new ArithmeticException("/0"); //it will also give Arithmetic exception "/0" manually defined by self.
    }
}


