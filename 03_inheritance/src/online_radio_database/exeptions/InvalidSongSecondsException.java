package online_radio_database.exeptions;

public class InvalidSongSecondsException extends InvalidSongLengthException {

    public InvalidSongSecondsException(String message) {
        super(message);
    }
}
