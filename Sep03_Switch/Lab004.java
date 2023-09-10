package Sep03_Switch;

public class Lab004 {
    public static void main(String[] args) {
        String code = "W";
        String msg = switch (code) {
            case "X":
                System.out.println("Hi");
                yield "Yes";
            default:
                System.out.println("Bye");
                yield "Default";
        };
        System.out.println(msg);
//        Here W is not present in the case so o/p is bye and default
    }
}
