package level_3;
import java.util.Scanner;
public class LeapYearprogramme {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
      if (year < 1582) {
            System.out.println("Year must be >= 1582");
        } 
        else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Leap Year");
                    } else {
                        System.out.println("Not a Leap Year");
                    }
                } else {
                    System.out.println("Leap Year");
                }
            } else {
                System.out.println("Not a Leap Year");
            }
        }
        input.close();  
   }
}
