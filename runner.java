import java.util.Scanner;
import java.util.function.Function;

public class runner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("hello");
        int x, y;
        x = scn.nextInt();
        y = scn.nextInt();
        function(x, y);

    }

    public static void function(int x, int y) {
        System.out.println(x * y);
    }
}