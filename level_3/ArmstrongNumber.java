package level_3;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (number != 0){
            int digit = number % 10;
            sum += digit * digit * digit;
            number = number/10;
        }
        if (sum == originalNumber) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        scanner.close();
    }
}
// Program to check whether a given number is an Armstrong number or not.
// An Armstrong number is a number that is equal to the sum of the cubes of its digits.
// Example: 153 = 1³ + 5³ + 3³
