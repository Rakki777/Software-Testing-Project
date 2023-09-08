package Sep03;

import java.util.Scanner;

public class Lab003 {
    public static void main(String[] args) {
        System.out.println("Enter the value of a,b,c \n i will give you max of it");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Your inputs are" + a + " " + b + " " + c );

//        a > b && a > c print a
//        b > c && b > a print b
//          c > a && c > b print c
        if(a>b && a>c) {
            System.out.println("Max is" + a);
        }
        if (b>c && b>a) {
            System.out.println("Max is" + b);
        }
        if (c>a && c>b) {
            System.out.println("Max is" + c);
        }
        }
    }

