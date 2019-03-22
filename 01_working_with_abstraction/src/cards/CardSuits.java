package cards;

public enum CardSuits {

    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    int power;

    CardSuits(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
