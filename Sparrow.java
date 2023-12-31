import java.time.LocalDate;

public class Sparrow extends Animal implements Flyable, Goable{
    public Sparrow(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    protected void move() {
        System.out.println(getName() + " is flying");
    }

    @Override
    public void toGo() {
        fly();
    }

    public void fly() {
        System.out.println(getName() + " is flying");
    }

    @Override
    public double getSpeed() {
        return 12.0;
    }

}