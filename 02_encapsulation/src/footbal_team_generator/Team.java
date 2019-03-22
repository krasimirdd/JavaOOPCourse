package footbal_team_generator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) throws Exception {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String name) throws Exception {

        Player playerToRemove = this.players.stream()
                .filter(p -> p.getName().equals(name))
                .findFirst().orElse(null);

        if (playerToRemove == null) {
            throw new Exception(String.format("Player %s is not in %s team.", name, this.getName()));
        }

        this.players.remove(playerToRemove);
    }

    public double getRating() {
        return Math.round(
                this.players.stream()
                        .mapToDouble(Player::overallSkillLevel)
                        .average()
                        .orElse(0)
        );
    }

    public String getName() {
        return name;
    }

    private void setName(String name) throws Exception {
        if (name == null || name.equals("\\s+") || name.isEmpty()) {
            throw new Exception("A name should not be empty.");
        }

        this.name = name;
    }
}
