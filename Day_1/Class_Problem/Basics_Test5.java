package Day_1.Class_Problem;
interface Ifruit{
    public String TYPE="Apple";  //by default static and final in interface
}

class Fruit implements Ifruit{

}

public class Basics_Test5{
    public static void main(String[] args) {
        System.out.println(Fruit.TYPE); //if something is static already then we dont need to create object of it. Here, TYPE is
    }
}