package Sep03;

public class Lab010 {
    public static void main(String[] args) {
//      Create a program that determins wether a
//      gven year is a leap year
//      A leap year is devisible by 4,
//      but not by 100 unless it is also divisible by 400
//      Use an IF-ELse statement to make this determination
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
