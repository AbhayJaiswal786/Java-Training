package Assignment_3;
//Day_5

public class Assignment_3_main {
    public static void main(String[] args) {
        //0&1 sort
        int Array[]={1,0,0,1,0,1};
        int N=Array.length;
        Ques_1_sort_0_1 sort=new Ques_1_sort_0_1();
        sort.do_sort(Array, N);

        
        //rotation
        int Array1[]={1,2,3,4,5,6,7};
        int N1=Array1.length;
        Ques_2_rotate rot=new Ques_2_rotate();
        rot.do_rotate(Array1,N1,-3);


        //smallest and largest number in array
        int Array2[]={7,5,6,4,2,0};
        int N2=Array2.length;
        Ques_3_smallest_largest_num s_l=new Ques_3_smallest_largest_num();
        s_l.find_smallest_largest_num(Array2, N2);

        //second smallest and largest number in array
        Ques_4_second_smallest_largest_num sec_s_l=new Ques_4_second_smallest_largest_num();
        sec_s_l.find_sec_smallest_largest_num(Array2, N2);



    }
    
}
