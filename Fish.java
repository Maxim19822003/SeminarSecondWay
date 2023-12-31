import java.time.LocalDate;

public class Fish extends Animal implements Swimable{
    public Fish(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    protected void move() {
        System.out.println(getName() + " is swimming");
    }

    @Override
    public void toGo() {
    swim();
    }

    public void swim() {
        System.out.println(getName() + " is swimming");
    }

    @Override
    public double getSpeed() {
        return 5.0;
    }

}

