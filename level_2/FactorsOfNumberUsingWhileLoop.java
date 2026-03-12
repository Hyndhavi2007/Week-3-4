package level_2;
import java.util.Scanner;
public class FactorsOfNumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int counter = 1;
        if (number > 0) {
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Enter positive integer");
        }
        sc.close();
    }
}
