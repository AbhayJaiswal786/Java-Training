package Day_7;

public class Test_1 {
    public static void main(String[] args) throws InterruptedException {
        dostuff();
    }
    public static void dostuff() throws InterruptedException{
        domorestuff();
    }
    public static void domorestuff(){
        try{
            Thread.sleep(1000);
            System.out.println("HII");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    
}
