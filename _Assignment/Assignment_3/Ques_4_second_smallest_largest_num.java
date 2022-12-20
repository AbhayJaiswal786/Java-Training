package Assignment_3;

class Ques_4_second_smallest_largest_num{
    void find_sec_smallest_largest_num(int array[],int N){
        //getting min and max value to search for second min and max value
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

        int sec_min=Integer.MAX_VALUE;
        int sec_max=Integer.MIN_VALUE;

        for(int i=0;i<N;i++){
            if(array[i]<sec_min && array[i]>min){
                sec_min=array[i];
            }
            if(array[i]>sec_max && array[i]<max){
                sec_max=array[i];
            }
        }

        System.out.println("\nSecond_Smallest: "+ sec_min);
        System.out.println("Second_Largest: "+ sec_max);

    }
}

