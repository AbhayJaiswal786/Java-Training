package Assignment_2.Question_1_Library_Management_System;

public abstract class GetDetails{
    void Intro(){
        System.out.println("Please Enter your details : ");
    }
    abstract void Name();
    abstract void Age();
    abstract void Gender();
    abstract void PhoneNum();
    abstract void Address();
}
