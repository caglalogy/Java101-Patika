import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float pear = 2.14f;
        float apple = 3.67f;
        float tomato = 1.11f;
        float banana = 0.95f;
        float eggplant = 5.00f;
        float total = 0.0f;
        float kg;

        System.out.println("Welcome to the green grocery!");
        System.out.print("Kg of pear: ");
        kg = input.nextFloat();
        total += kg * pear;

        System.out.print("Kg of apple: ");
        kg = input.nextFloat();
        total += kg * apple;
        System.out.print("Kg of tomato: ");
        kg = input.nextFloat();
        total += kg * tomato;

        System.out.print("Kg of banana: ");
        kg = input.nextFloat();
        total += kg * banana;

        System.out.print("Kg of eggplant: ");
        kg = input.nextFloat();
        total += kg * eggplant;

        System.out.println("Total amount of money you must pay: " + total);

    }
}
