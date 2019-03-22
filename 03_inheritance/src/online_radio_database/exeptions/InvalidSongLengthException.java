package online_radio_database.exeptions;

public class InvalidSongLengthException extends InvalidSongException {
    public InvalidSongLengthException(String message) {
        super(message);
    }
}
