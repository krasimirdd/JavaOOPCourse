package mankind;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            String[] s = scanner.nextLine().split(" ");
            Student student = new Student(s[0], s[1], s[2]);
            System.out.println(student.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            String[] w = scanner.nextLine().split(" ");
            Worker worker = new Worker(w[0], w[1], Double.parseDouble(w[2]), Double.parseDouble(w[3]));
            System.out.println(worker.toString());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
