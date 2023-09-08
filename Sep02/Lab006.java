package Sep02;

public class Lab006 {
    public static void main(String[] args) {
//Unicode chars
        char c3 = '\u263a';
        System.out.println(c3);
        int a = 101; //int
        int b = 0101; //oct - converted oct to int ASCII value i.e. 65
        int c = 0xface; //hex
        int d = 0b0101; // binary

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

//        String literal
        String s1 = null;
//Boolean Literals
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = (b1==b2); //== equal opperator
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


    }

}
