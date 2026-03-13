package level_3;
import java.util.Scanner;
public class BMIprogram {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight of the person(in Kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height of the person(in Cm): ");
        double heightCM = scanner.nextDouble();
        double heightM =  heightCM / 100;
        System.out.println("The height of the person in meters is " + heightM);
        double bmi = weight / (heightM * heightM);
        if(bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal Weight");
        } else if ( bmi < 30) {
            System.out.println(" Overweight");
        } else {
            System.out.println("Obese");
        }
        scanner.close();
    }
}
