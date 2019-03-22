package telephony;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> numbers = new ArrayList<>();
        numbers.add("1231");
        numbers.add("125125");
        numbers.add("1");
        numbers.add("asdas");

        List<String> urls = new ArrayList<>();
        urls.add("http://softuni.bg");
        urls.add("http://youtube.com");
        urls.add("1");
        urls.add("http://www.g00gle.com");

        Smartphone ph1 = new Smartphone(numbers, urls);

        System.out.println(ph1.call());
        System.out.println(ph1.browse());
    }
}
