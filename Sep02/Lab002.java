package Sep02;

public class Lab002 {
    public static void main(String[] args) {
        int b,c,d;
        int a = b = c = d = 99; //even thogh we not initialized a but b,c,d is initilized so its starts from d,c,b,a
//        System.out.println(a+b+c); OP is 297

        int c1 = '*';
        char c2 = '*';
        char c3 = '/';
//        System.out.println(c1); //output is the decimal value of * as DT is int
//        System.out.println(c2); // output is * as DT is char
//        System.out.println(c2+c2); // output is 'int' as DT is char + char i.e dec value of *+*
//        System.out.println(c3);// output is * as DT is char
//        System.out.println(c3+c3);// output is int as DT is char + char i.e dec value of /+/
        byte b1 = 127;
//        System.out.println(b1+b1); //OP is int as the DT is byte + byte i.e dec value of 127+127 byte (OP is 254)
        short x1 = 32767;
        System.out.println(x1+b1); // OP is int as DT is short + byte i.e. dec value of 127 byte + 32767 short (OP is 32894)



    }
}
