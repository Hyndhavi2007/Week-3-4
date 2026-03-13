package level_3;
import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Physics Marks: ");
        double physics = input.nextDouble();
         System.out.print("Enter Chemistry Marks: ");
        double chemistry = input.nextDouble();
         System.out.print("Enter Maths Marks: ");
        double maths = input.nextDouble();
        double average = (physics + chemistry + maths) / 3;
        System.out.println("Average Marks: " + average);
        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        input.close();
    }    
}
