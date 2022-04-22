package HW1;

public class Robot {

    private String name;
    private  String run;
    private  String gap;

    public Robot(String name, String run, String gap) {
        this.name = name;
        this.run = run;
        this.gap = gap;
    }

    public String getRun() {
        return run;
    }

    public String getGap() {
        return gap;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", run='" + run + '\'' +
                ", gap='" + gap + '\'' +
                '}';
    }
}
