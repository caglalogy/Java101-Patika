import java.math.MathContext;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /** float edge1, edge2, hypo;

        System.out.println("------RIGHT TRIANGLE CALCULATOR------");
        System.out.print("enter first edge of right triangle: ");
        edge1 = input.nextFloat();
        System.out.print("enter second edge of right triangle: ");
        edge2 = input.nextFloat();

        hypo = (float) Math.sqrt(Math.pow(edge1, 2) + Math.pow(edge2, 2));
        System.out.println("hypotenuse is " + hypo);

        // triangle area calculation
        float perimeter = edge1 + edge2 + hypo; //2u
        float u = perimeter/2; //u
        float area = (float) Math.sqrt(u * (u - edge1) * (u-edge2) * (u - hypo));
        System.out.println("area is " + area);
        */

        float e1, e2, e3;
        System.out.println("------TRIANGLE AREA CALCULATOR------");
        System.out.print("enter first edge of the triangle: ");
        e1 = input.nextFloat();
        System.out.print("enter second edge of the triangle: ");
        e2 = input.nextFloat();
        System.out.print("enter third edge of the triangle: ");
        e3 = input.nextFloat();

        float perimeter = e1 + e2 + e3; //2u
        float u = perimeter/2; //u
        float area = (float) Math.sqrt(u * (u - e1) * (u-e2) * (u - e3));
        System.out.println("area is " + area);

    }
}
