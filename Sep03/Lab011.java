package Sep03;

public class Lab011 {
    public static void main(String[] args) {
//        write a program that classifies a triangle based on its side lengths.
//        Given 3 input values representing the lengths of the sides
//        Determine if the triangle is equilateral (all sides are equal)
//        isosceles (exactly 2 sides are equal), or scalene (no sides are equal).
//        Use an if-else statement to clarify the triangle
        int sideA = 5;
        int sideB = 7;
        int sideC = 5;
        if (sideA == sideB && sideB == sideC){
            System.out.println("its a EQLTRL Triangle");
        }
        else if(sideA == sideB || sideA == sideC || sideB == sideC){
            System.out.println("its a isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }

    }
}
