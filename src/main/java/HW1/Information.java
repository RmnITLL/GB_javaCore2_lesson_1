package HW1;

public class Information {

    public static void main(String[] args) {

       Running[] runnings = {
               new Human("Anton"),
               new Cat("Vaska"),
               new Robot("R2A2")
       };

       Gapping[] gappings = {
               new Human("Anton"),
               new Cat("Vaska"),
               new Robot("R2A2")
       };

       RunningRoad[] runningRoad = {
               new RunningRoad(100),
               new RunningRoad(200)
       };

       TheWall[] theWalls = {
               new TheWall(3),
               new TheWall(5),
               new TheWall(10)
       };

       for (Running walk: runnings) {
               walk.run();
           }

       for (Gapping crawl: gappings) {
           crawl.gap();
       }

    }
}
