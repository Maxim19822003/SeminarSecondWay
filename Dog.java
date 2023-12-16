import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable{
    public Dog() {
        super();
    }

    public Dog(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public void toGo() {
        move();
    }

    @Override
    public double getSpeed() {
        return 8.0;
    }
}
