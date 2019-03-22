package traffic_lights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] lights = reader.readLine().split("\\s+");
        int times = Integer.parseInt(reader.readLine());

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String light : lights) {
            TrafficLight tf = new TrafficLight(Light.valueOf(light));
            trafficLights.add(tf);
        }

        StringBuilder sb = new StringBuilder();
        while (times-- > 0) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.update();
                sb.append(trafficLight.toString()).append(" ");
            }
            sb.append(System.lineSeparator());
        }

        System.out.println(sb.toString());
    }
}
