package animal_farm;

public class Main {
    public static void main(String[] args) {

        try {
            Chicken c = new Chicken("Mara", 20);
            System.out.println(c.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
