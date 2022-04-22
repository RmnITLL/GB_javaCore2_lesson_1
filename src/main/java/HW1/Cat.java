package HW1;

public class Cat {

    private String name;
    private  String run;
    private  String gap;

    public Cat(String name, String run, String gap) {
        this.name = name;
        this.run = run;
        this.gap = gap;
    }

    public String getName() {
        return name;
    }

    public String getRun() {
        return run;
    }

    public String getGap() {
        return gap;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", run='" + run + '\'' +
                ", gap='" + gap + '\'' +
                '}';
    }
}
