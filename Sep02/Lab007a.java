package Sep02;

public class Lab007a {
    public static void main(String[] args) {
//        Casting - Implicit and Explicite casting
//        implicite casting - widening
        byte b = 10;
        int a = b;
        System.out.println(a); // as byte is smaller bucket is filled in int big bucket (jvm automatically handle it)
        int coursefee = 10;
        float gst = 0.18f;
        float totalfee = coursefee+(int)gst; //there will be no data loss in implicite casting ()
//        float totalfee = coursefee+gst; //there will be data loss in explisite casting ()
        System.out.println(totalfee);
//        Explicite casting : Widening and Narrowing
        //Narrowing - Bigger to smaller
        int c = 99;
        //byte d = c; //int is big bucket and byte is smaller bucket so we have to change
        byte d = (byte) c;
        System.out.println(d);
    }
}
