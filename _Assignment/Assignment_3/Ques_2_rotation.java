package Assignment_3;

//rotation with given k number of times.
        // if k is positive, rotation right side
        // if k is negative, rotation left side
        // if k is zero, no rotation

        class Ques_2_rotate{
            void do_rotate(int array[],int N,int k){
                int rot_count=k;
                if(k>0){
                    System.out.println("\n"+k+" times rotation right side:");
                    while(rot_count>0){
                        int last_element=array[N-1];
                        for(int i=N-1;i>0;i--){
                            array[i]=array[i-1];                   
                        } 
                        array[0]=last_element;
                        rot_count--;
                    }
                }
                
                else if(k<0){
                    System.out.println("\n"+k+" times rotation left side:");
                    while(rot_count<0){
                        int first_element=array[0];
                        for(int i=0;i<N-1;i++){
                            array[i]=array[i+1];
                        }
                        array[N-1]=first_element;
                        rot_count++;
                    }
                }
        
                else{
                    System.out.println("\nNo rotation!");
                }
                //printing array
                _print_array p1 = new _print_array();
                p1.do_print(array,N);
            }
        }
