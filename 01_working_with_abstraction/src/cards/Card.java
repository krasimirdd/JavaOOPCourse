package cards;

public class Card {
    String name;
    String suit;
    int power;

    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
        this.power = CardPowers.valueOf(name).getPower() + CardSuits.valueOf(suit).getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.name, this.suit, this.power);
    }
}
