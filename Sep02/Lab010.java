package Sep02;

public class Lab010 {
    public static void main(String[] args) {
//        Logical Opperator
        boolean a1 = true;
        boolean a2 = false;
        boolean a3 = true;
        System.out.println(a1 & a2); //AND opperator
        System.out.println(a1 && a3); //
        System.out.println(a1 || a2); // OR opperator

//        New Opperator
        String s1 = new String("rakshith"); // new is a opperator which creates new object in class
        System.out.println(s1 instanceof Object);//OP is true Instanceof opperator - this will only used for non premitive data types

//        Ternary Opperator
//        coniditon with true or false, if true do this-if false do this
        int a = true?10:20;
        System.out.println(a);

        int age = 18;
        boolean caniwatchmovie = age>18?true:false;
        String caniwatchmovie1 = age >18 ?"Yes" :"No";
        System.out.println(caniwatchmovie);
        System.out.println(caniwatchmovie1);
        float f = 20>19 ? 10.14f:10.20f;
        System.out.println(f);
        int b = 10;
        int c = 20;
        int d = 5;
        int max = b>c? b:c;
        System.out.println(max);
//        int max1 = b>c? b:c && c>d c:d; //asignment


    }
}
