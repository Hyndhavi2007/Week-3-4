package level_1;
import java.util.Scanner;
public class NaturalNumbersSumUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (n > 0) {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("Sum using loop = " + sum);
            System.out.println("Sum using formula = " + formula);
        } else {
            System.out.println("Enter a natural number");
      
        } 
        sc.close();
    }
}
