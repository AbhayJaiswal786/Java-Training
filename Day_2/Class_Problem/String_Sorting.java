package Day_2.Class_Problem;

public class String_Sorting {
    public static void main(String[] args) {
        String s="AbhayJaiswal";
        int n=s.length();
        char array[]=new char[n];

        for(int i=0;i<n;i++){
            array[i]=s.charAt(i);
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                if(array[i]>array[j]){
                    char temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
    
}
