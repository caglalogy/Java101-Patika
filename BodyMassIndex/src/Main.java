import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, weight, bmi;

        System.out.println("BODY MASS INDEX CALCULATOR");
        System.out.print("Enter your height (as meters): ");
        height = input.nextDouble();
        System.out.print("Enter your weight (as kilograms): ");
        weight = input.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.println("Your body-mass-index is " + bmi);

    }
}
