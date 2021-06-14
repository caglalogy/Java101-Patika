import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /**
         * This is a program that calculates the money to be paid.
         * It takes km, start price and amount of money per km as inputs.
         */
        double startPrice, km, perKm, totalPrice, bill;
        startPrice = 10;
        System.out.println("---------TAXIMETER---------");
        System.out.println("Start price is " + startPrice);
        System.out.println("If the price is less than 20 TL, then you must pay 20 TL.");
        System.out.println();

        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble();
        System.out.print("Enter the money per km: ");
        perKm = input.nextDouble();

        totalPrice = (km * perKm) + 10;

        bill = (totalPrice > 20) ? totalPrice:20;

        System.out.println("You should pay " + bill + " TL");

    }
}
