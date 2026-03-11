package level_1;
import java.util.Scanner;
public class FactorialusingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial = " + factorial);
        } else {
            System.out.println("Enter a positive integer");
        }
        sc.close();
    }
}
