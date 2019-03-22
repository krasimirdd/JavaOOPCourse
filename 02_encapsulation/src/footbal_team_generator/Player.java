package footbal_team_generator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) throws Exception {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    private void setEndurance(int endurance) throws Exception {
        this.statsValidator("Endurance", endurance);
        this.endurance = endurance;
    }

    private void setSprint(int sprint) throws Exception {
        this.statsValidator("Sprint", sprint);
        this.sprint = sprint;
    }

    private void setDribble(int dribble) throws Exception {
        this.statsValidator("Dribble", dribble);
        this.dribble = dribble;
    }

    private void setPassing(int passing) throws Exception {
        this.statsValidator("Passing", passing);
        this.passing = passing;
    }

    private void setShooting(int shooting) throws Exception {
        this.statsValidator("Shooting", shooting);
        this.shooting = shooting;
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

    public double overallSkillLevel() {
        return (this.endurance + this.sprint + this.dribble + this.passing + this.shooting) / 5.0;
    }

    private void statsValidator(String stats, int value) throws Exception {
        if (value < 0 || value > 100) {
            throw new Exception(String.format("%s should be between 0 and 100.", stats));
        }
    }
}
