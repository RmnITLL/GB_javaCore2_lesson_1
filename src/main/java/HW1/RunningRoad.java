package HW1;

public class RunningRoad {

    private int distance;

    public RunningRoad(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void infoRunningRoad() {
        if (distance > 0) {
            System.out.printf("%s Смог пробежать %d", distance);
        } else {
            System.out.printf(" к сожелению не смог пробежать");
        }
    }

    @Override
    public String toString() {
        return "RunningRoad{" +
                "distance=" + distance +
                '}';
    }
}
