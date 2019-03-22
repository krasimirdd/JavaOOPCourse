package box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Box box = null;

        try {
            box = new Box(
                    Double.parseDouble(scanner.nextLine()),
                    Double.parseDouble(scanner.nextLine()),
                    Double.parseDouble(scanner.nextLine())
            );

            System.out.printf("Surface Area - %.2f%n", box.calculateSurfaceArea());
            System.out.printf("Lateral Surface Area - %.2f%n", box.calculateLateralSurfaceArea());
            System.out.printf("Volume - %.2f", box.calculateVolume());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
