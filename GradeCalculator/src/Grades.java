import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float math, physics, chem, turkish, history, music;

        System.out.println("math grade: ");
        math = input.nextFloat();

        System.out.println("physics grade: ");
        physics = input.nextFloat();

        System.out.println("chemistry grade: ");
        chem = input.nextFloat();

        System.out.println("turkish grade: ");
        turkish = input.nextFloat();

        System.out.println("history grade: ");
        history = input.nextFloat();

        System.out.println("music grade: ");
        music = input.nextFloat();

        float mean = (math + physics + chem + turkish + history + music)/6;

        System.out.println("your grade mean is " + mean);

        // condition statement without if/else
        String result = (mean > 60) ? "you passed." : "you failed.";
        System.out.println(result);
    }
}
