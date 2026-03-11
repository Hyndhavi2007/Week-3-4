package level_2;
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Salary: $ ");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();
        if(years > 5){
            double bonus = salary * 0.05;
            System.out.println("Bonous Amount = $ " + bonus);
        }else{
            System.out.println("No Bonous.");
        }
        scanner.close();
    }
}
