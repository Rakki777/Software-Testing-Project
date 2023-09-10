package Sep03_Switch;

public class Lab003b {
    public static void main(String[] args) {
        int item = 007;
//        From JDK > 11, we can use multiple case in 1 line
        switch (item){
            case 001,002,003:
                System.out.println("From 1 to 3");
                break;
            case 004,005,006:
                System.out.println("From 3 to 6");
            default:
                System.out.println("Not Found");
//                Output is Not found as 007 not found

        }
    }
}
