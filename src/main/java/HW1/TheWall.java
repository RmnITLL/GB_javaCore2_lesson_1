package HW1;

public class TheWall {

    private int climb;

    public TheWall(int climb) {
        this.climb = climb;
    }

    public int getClimb() {
        return climb;
    }

    public void infoClimbOverTheWall(String getName, int climb) {
        if (climb > 0) {
            System.out.printf("%s Смог прелезеь %d", getName, this.climb);
        } else {
            System.out.printf("%s к сожелению не смог перелезть", getName);
        }
    }

    @Override
    public String toString() {
        return "RunningRoad{" +
                "distance=" + climb +
                '}';
    }


}
