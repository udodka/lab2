import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        if (num <= 0 || num >= 15) {
            System.out.println("Error.");
        } else {
            int result = 1;
            for (int i = 0; i < num; ++i) {
                result *= i + 1;
            }
            System.out.println(result);
        }
    }
}