package online_radio_database.exeptions;

public class InvalidArtistNameException extends InvalidSongException {

    public InvalidArtistNameException(String message) {
        super(message);
    }
}
