package org.studyeasy;
import java.util.*;
public class Main {
    public static void checkEligibilty(int age) throws IllegalArgumentException{
        if(age<18){
            throw new IllegalArgumentException("Age is be 18 or above");
        }else{
            System.out.println("Voter is eligible for voting");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter your age:");
            int age=sc.nextInt();
            checkEligibilty(age);
        }catch(IllegalArgumentException e){
            System.out.println("caught exception !!"+e.getMessage());
        }
    }
}