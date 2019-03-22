package online_radio_database.exeptions;

public class InvalidSongException extends Exception {
    private String message;

    public InvalidSongException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
