package Assignment_3;

//smallest and largest number in array

class Ques_3_smallest_largest_num{
    void find_smallest_largest_num(int array[],int N){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            if(array[i]<min){
                min=array[i];
            }
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("\nSmallest: "+min);
        System.out.println("Largest: "+max);

    }
}

