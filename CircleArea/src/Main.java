import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final float pi =  3.14f;    // pi number is a constant.
        double r, c_angle, area;    // these variables are defined as double for sensitive calculations.

        System.out.println("Welcome to the circle-slice-area calculator!");
        System.out.print("Enter the radius: ");
        r = input.nextDouble();
        System.out.print("Enter the center angle: ");
        c_angle = input.nextDouble();

        area = (pi * Math.pow(r, 2) * c_angle) / 360;

        System.out.println("Area of slice is " + (float) area);

    }
}
