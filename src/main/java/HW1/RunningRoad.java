package HW1;

public class RunningRoad {

    private int distance;

    public RunningRoad(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void infoRunningRoad(String getName, int distance) {
        if (distance > 0) {
            System.out.printf("%s Смог пробежать %d", getName, distance);
        } else {
            System.out.printf("%s к сожелению не смог пробежать", getName);
        }
    }

    @Override
    public String toString() {
        return "RunningRoad{" +
                "distance=" + distance +
                '}';
    }
}
