package traffic_lights;

public class TrafficLight {
    private Light state;

    public TrafficLight(Light state) {
        this.state = state;
    }

    public void update() {
        switch (this.state) {
            case RED:
                this.state = Light.GREEN;
                break;
            case GREEN:
                this.state = Light.YELLOW;
                break;
            case YELLOW:
                this.state = Light.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return this.state.toString();
    }
}
