package level_2;
import java.util.Scanner;
public class PoweOfaNumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        int result = 1;
        int counter = 0;
        while (counter < power) {
            result = result * number;
            counter++;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}

