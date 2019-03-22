package cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String label = scanner.nextLine();
        String suit = scanner.nextLine();

        Card card = new Card(label, suit);
        System.out.println(card.toString());
    }
}
