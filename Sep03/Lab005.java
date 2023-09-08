package Sep03;

public class Lab005 {
//    if within if
        public static void main(String[] args) {
        if(true){
            System.out.println("1");
            if(true){
                System.out.println("2");
                if(false) {
                    System.out.println("3"); // as its false, its skips
                }
                else{
                    System.out.println("4");
                }
            }
        }
    }
}
