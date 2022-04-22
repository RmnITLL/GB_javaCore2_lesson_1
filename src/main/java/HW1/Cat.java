package HW1;

public class Cat implements Running, Gapping {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.printf("%s пробежал \n", name);
    }

    @Override
    public void gap() {
        System.out.printf("%s перепрыгнул \n", name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
