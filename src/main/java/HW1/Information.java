package HW1;

public class Information {

    public static void main(String[] args) {

        Object[] object = new Object[] {
                new Cat("Vaska", "10", "2"),
                new Human("Anton", "200", "1,7"),
                new Robot("A2R2", "0,1", "0,01")
        };

        Object[] objectsAction = new Object[] {
                new RunningRoad(300),
                new TheWall(5)
        };


    }
}
