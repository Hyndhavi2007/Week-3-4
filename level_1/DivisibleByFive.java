package level_1;
import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if(n % 5 == 0){
            System.out.println("Is the number " + n + " divisible by 5?" + "Yes.");
        }else{
            System.out.println("Is the number " + n + " divisible by 5?" + "No.");
        }
        scanner.close();
    }
}
