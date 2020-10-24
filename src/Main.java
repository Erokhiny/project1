import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Yarok");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = a + b;
        System.out.println("Сумма a + b = " + c);
    }
}
