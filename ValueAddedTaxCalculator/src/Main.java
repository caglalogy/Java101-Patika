import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price;
        int vatRate;
        double vat;
        double totalPrice;

        System.out.print("enter the amount of price: ");
        price = input.nextDouble();

        vatRate = (price > 1000) ? 8:18;
        vat = price * vatRate / 100;
        totalPrice = price + vat;

        System.out.println("Report:");
        System.out.println("Tax rate: " + vatRate+"%");
        System.out.println("Price before value-added-tax: " + price);
        System.out.println("Tax: " + vat);
        System.out.println("Price after value-added-tax: " + totalPrice);
    }
}
