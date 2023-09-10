package Sep03_Switch;

import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args) {
//        Its has expression
//        switch (expression){
//        case1:
//        sout();
//        case3:
//        sout();
//    }
//        Taje a user input - 1 -7 day
//        day 1 - monday
//        day 3 - wed
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Day");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid Day");
        }
        System.out.println("Outside the loop");
    }
}

