package telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = new ArrayList<>(numbers);
        this.urls = new ArrayList<>(urls);
    }

    @Override
    public String browse() {
        StringBuilder result = new StringBuilder();
        for (String url : urls) {
            boolean isAlphabetic = url.chars().noneMatch(Character::isDigit);
            if (isAlphabetic) {
                result.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            } else {
                result.append("Invalid URL!").append(System.lineSeparator());
            }
        }

        return result.toString();
    }

    @Override
    public String call() {
        String result = "";
        for (String number : numbers) {
            boolean isNumeric = number.chars().allMatch(Character::isDigit);
            if (isNumeric) {
                result += "Calling... " + number + "\n";
            } else {
                result += "Invalid number!\n";
            }
        }

        return result.trim();
    }
}
