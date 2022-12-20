package Assignment_3;

// 0&1 array sort
public class Ques_1_sort_0_1{
    void do_sort(int array[],int N){
        System.out.println("Sorted array is:");
        int temp;
        for(int i=0;i<N;i++){
            int Min_Index=i;
            for(int j=i+1;j<N;j++){
                if(array[j]<array[Min_Index]){
                    Min_Index=j;
                }
            }
            temp=array[i];
            array[i]=array[Min_Index];
            array[Min_Index]=temp;
        }
        
        _print_array p1 = new _print_array();
        p1.do_print(array,N);

    }
}
