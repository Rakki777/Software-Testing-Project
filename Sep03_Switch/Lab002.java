package Sep03_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Lab002 {
    public static void main(String[] args) {
//        Ovels A,E,I,O,U
        System.out.println("Enter a Char");
        Scanner sc = new Scanner(System.in);
        //char c = sc.next() character u will not get
        String c = sc.next();
        c = c.toLowerCase(Locale.ROOT);
        switch (c) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Ovels");
                break;
            default:
                System.out.println("Non Ovels");
        }

    }
}
