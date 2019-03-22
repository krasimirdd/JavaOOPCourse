package online_radio_database;

import java.util.ArrayList;
import java.util.List;

public class SongDatabase {
    private int songCount;
    private List<Song> songs;

    public SongDatabase() {
        this.songs = new ArrayList<>();
        this.songCount = 0;
    }

    public int getSongCount() {
        return songCount;
    }

    public void addSong(Song song) {
        this.songs.add(song);
        System.out.println("Song added.");
        this.songCount++;
    }

    public String getTotalLengthOfSongs() {
        int sumOfHours = 0;

        int sumOfMinutes = songs.stream()
                .mapToInt(s -> Integer.parseInt(s.getLength().split(":")[0])).sum();

        int sumOfSeconds = songs.stream()
                .mapToInt(s -> Integer.parseInt(s.getLength().split(":")[1])).sum();

        while (sumOfSeconds >= 60) {
            sumOfMinutes++;
            sumOfSeconds -= 60;
        }

        while (sumOfMinutes >= 60) {
            sumOfHours++;
            sumOfMinutes -= 60;
        }
        return String.format("Playlist length: %dh %dm %ds", sumOfHours, sumOfMinutes, sumOfSeconds);
    }
}
