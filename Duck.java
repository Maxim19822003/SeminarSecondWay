import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimable, Goable{
    public Duck(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    protected void move() {
        System.out.println(getName() + " is walking, flying, and swimming");

    }
    
    @Override
    public void toGo() {
        fly();
    }

    public void fly() {
        System.out.println(getName() + " is flying");
    }

    public void swim() {
        System.out.println(getName() + " is swimming");
    }

    @Override
    public double getSpeed() {
        return 12.0;
    }

}
