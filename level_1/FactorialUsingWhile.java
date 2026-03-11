package level_1;
import java.util.Scanner;
public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int i = 1;
            long factorial = 1;
            while (i <= n) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("Factorial = " + factorial);
        } else {
            System.out.println("Enter a positive integer");
        }
        sc.close();
    }
}
