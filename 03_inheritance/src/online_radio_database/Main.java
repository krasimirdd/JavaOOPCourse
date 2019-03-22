package online_radio_database;

import online_radio_database.exeptions.InvalidSongException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SongDatabase db = new SongDatabase();
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {

            String[] input = scanner.nextLine().split(";");

            try {
                Song song = new Song(input[0], input[1], input[2]);
                db.addSong(song);
            } catch (InvalidSongException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Song added: " + db.getSongCount());
        System.out.println(db.getTotalLengthOfSongs());
    }
}
