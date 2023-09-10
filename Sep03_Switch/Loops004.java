package Sep03_Switch;

public class Loops004 {
    public static void main(String[] args) {
//        Go from 1 to 10  and print them but if you find element i = 5 then break
//        use i.e. For If

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
            if (i == 5){
                System.out.println("found 5");
                break;
            }
            
        }
    }
}
