package vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] s = scanner.nextLine().split(" ");
        Car car = null;
        try {
            car = new Car(Double.parseDouble(s[1]), Double.parseDouble(s[2]), Double.parseDouble(s[3]));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        s = scanner.nextLine().split(" ");
        Truck truck = null;
        try {
            truck = new Truck(Double.parseDouble(s[1]), Double.parseDouble(s[2]), Double.parseDouble(s[3]));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        s = scanner.nextLine().split(" ");
        Bus bus = null;
        try {
            bus = new Bus(Double.parseDouble(s[1]), Double.parseDouble(s[2]), Double.parseDouble(s[3]));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            s = scanner.nextLine().split(" ");

            switch (s[0]) {
                case "Drive":
                    if (s[1].equals("Car")) {
                        System.out.println(car.drive(Double.parseDouble(s[2])));
                    } else if (s[1].equals("Truck")) {
                        System.out.println(truck.drive(Double.parseDouble(s[2])));
                    } else {
                        System.out.println(bus.drive(Double.parseDouble(s[2])));

                    }
                    break;

                case "Refuel":
                    if (s[1].equals("Car")) {
                        try {
                            car.refuel(Double.parseDouble(s[2]));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } else if (s[1].equals("Truck")) {
                        try {
                            truck.refuel(Double.parseDouble(s[2]));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        try {
                            bus.refuel(Double.parseDouble(s[2]));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;

                case "DriveEmpty":
                    System.out.println(bus.driveEmpty(Double.parseDouble(s[2])));
                    break;

            }
        }

        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(bus.toString());
    }
}