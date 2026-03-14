package level_3;
import java.util.Scanner;
public class CalculatorusingSwitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter number2: ");
        double number2 = scanner.nextDouble();
        System.out.print("Enter operator (+,-,*,/): ");
        String op = scanner.next();
        switch(op){
            case "+":
                System.out.println("The sum is " + (number1 + number2));
                break;
            case "-":
                System.out.println("The difference is " + (number1 - number2));
                break;
            case "*":
                System.out.println("The product is " + (number1 * number2));
                break;
            case "/":
                System.out.println("The division is " + (number1 / number2));
                break;
            default:
                System.out.println("Invalid operator");
        }
        scanner.close();
    }
}