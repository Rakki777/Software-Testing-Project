package Sep03_Switch;

import java.util.Scanner;

public class Lab002TraficLights2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Input Numbers from 2 to 4");
        int s1 = 2;
        s1 = sc.nextInt();
        switch (s1) {
            case 2 -> System.out.println("Next will be Yellow");
            case 3 -> System.out.println("Next will be Green");
            case 4 -> System.out.println("Next will be Red");
            default -> System.out.println("Invalid State");
        }

        }
    }
