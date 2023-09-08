package Sep02;

public class Lab007 {
    public static void main(String[] args) {
//        Unary opperator
//        part 1 = -,+, !, ~ (once compliment)
//        partt 2 = increase ++, decrease --
        int a = 10;

        System.out.println(+a);
        System.out.println(-a);
        boolean b = true;
        System.out.println(!b); //reverse
        // a = 5 (0101)binary
        int a1 = 5;
        // Bitwise Compliment (~)
        System.out.println(~a1); // result is -6 | 5 of binary (0101) reverse is 1010 (10) Note: Compiler will give 2’s complement of that number, i.e., 2’s complement of 10 will be -6.


    }
}
