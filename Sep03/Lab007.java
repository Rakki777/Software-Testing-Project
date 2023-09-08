package Sep03;

public class Lab007 {
//    Else If condition
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int c = 60;
        int max = 0;
        if(a>b && a>c){
            max = a;
        } else if (b>c && b>a) {
            max = b;
        }else {
            max = c;
        }
        System.out.println(max);
        }
    }

