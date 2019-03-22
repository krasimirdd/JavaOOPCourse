package jedygalaxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] dimensions = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = reader.readLine();

        Galaxy galaxy = new Galaxy(dimensions[0], dimensions[1]);
        StarsManipulator starsManipulator = new StarsManipulator(galaxy);
        long sum = 0;

        while (!"Let the Force be with you".equals(input)) {

            int[] playerPositions = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int[] enemyPositions = Arrays.stream(reader.readLine()  .split("\\s+")).mapToInt(Integer::parseInt).toArray();

            starsManipulator.destroyStars(enemyPositions);

            sum += starsManipulator.collectStars(playerPositions);
            input = reader.readLine();
        }
        System.out.println(sum);
    }
}
