package footbal_team_generator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Team> teams = new HashMap<>();

        while (!"END".equals(input)) {
            String[] data = input.split(";");
            String command = data[0];
            String teamName = data[1];

            try {
                switch (command) {

                    case "Team":
                        teams.putIfAbsent(teamName, new Team(teamName));
                        break;

                    case "Add":
                        if (!teams.containsKey(teamName)) {
                            throw new Exception(String.format("Team %s does not exist.", data[1]));
                        }
                        teams.get(teamName).addPlayer(
                                new Player(data[2],
                                        Integer.parseInt(data[3]),
                                        Integer.parseInt(data[4]),
                                        Integer.parseInt(data[5]),
                                        Integer.parseInt(data[6]),
                                        Integer.parseInt(data[7]))
                        );
                        break;

                    case "Remove":
                        teams.get(teamName).removePlayer(data[2]);
                        break;

                    case "Rating":
                        if (!teams.containsKey(teamName)) {
                            throw new Exception(String.format("Team %s does not exist.", data[1]));
                        }

                        System.out.println(teamName + " - " + (int) teams.get(teamName).getRating());
                        break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            input = scanner.nextLine();
        }
    }
}

