package online_radio_database;

import online_radio_database.exeptions.*;

public class Song {

    private String artistName;
    private String songName;
    private String length;

    public Song(String artistName, String songName, String length) throws InvalidSongException {
        this.setArtistName(artistName);
        this.setSongName(songName);
        this.setLength(length);
    }

    private void setArtistName(String artistName) throws InvalidArtistNameException {
        if (artistName.length() < 3 || artistName.length() > 20) {
            throw new InvalidArtistNameException(Messages.ARTIST_NAME_EXEPTION);
        }
        this.artistName = artistName;
    }

    private void setSongName(String songName) throws InvalidSongNameException {
        if (songName.length() < 3 || songName.length() > 30) {
            throw new InvalidSongNameException(Messages.SONG_NAME_EXEPTION);
        }
        this.songName = songName;
    }

    protected String getLength() {
        return length;
    }

    private void setLength(String length) throws InvalidSongMinutesException, InvalidSongSecondsException {
        String[] data = length.split(":");
        if (Integer.parseInt(data[0]) > 14 || Integer.parseInt(data[0]) < 0) {
            throw new InvalidSongMinutesException(Messages.SONG_MINUTES_EXEPTION);
        }
        if (Integer.parseInt(data[1]) > 59 || Integer.parseInt(data[1]) < 0) {
            throw new InvalidSongSecondsException(Messages.SONG_SECONDS_EXEPTION);
        }
        this.length = length;
    }
}
