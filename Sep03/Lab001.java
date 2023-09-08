package Sep03;

import java.util.Scanner;

public class  Lab001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number from 1 to 3");
        int s1 = 1;
        s1 = sc.nextInt();
        switch (s1){
            case 1:
                System.out.println("Next will be Yellow");
                break;
            case 2:
                System.out.println("Next will be Green");
                break;
            case 3:
                System.out.println("Next will be Red");
                break;
            default:
                System.out.println("Invalid State");

        }
    }
}
