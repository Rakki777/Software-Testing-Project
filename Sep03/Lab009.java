package Sep03;

import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
//        Grade Calculator
//        Write a program to calculate the and displays the ltter grade for a given numarical score (eg A,B,C,D,E)
//        Based on the following grade scale
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D:60-69
//        F:0-59

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Score");
        int score = sc.nextInt();
        char grade = 0;
        if(score >=90 && score <=100) {
            grade = 'A';
        }
        else if(score >=80 && score <=89){
            grade = 'B';
        }
        else if(score >=70 && score <=79){
            grade = 'C';
        }
        else if(score >=60 && score <=69){
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        System.out.println("Your Grade is " + grade);
    }
}
