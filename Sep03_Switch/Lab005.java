package Sep03_Switch;

public class Lab005 {
    public static void main(String[] args) {
//        Lamba Expression from Java 13 or 14 using arrow can define the cases and no need break
        int item = 001;
        switch (item){
            case 001 -> System.out.println("It is 001");
            case 002 -> System.out.println("It is 002");
            case 003 -> System.out.println("It is 003");
            default -> System.out.println("Default");
        }
    }
}
