import java.time.LocalDate;

public class FlyingAnimal extends Animal implements Flyable{
    public FlyingAnimal(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
    @Override
    public double getSpeed() {
        return 20.0;
    }

    @Override
    public void toGo() {
        // Переопределение для летающего животного
        fly();
    }
    public void fly() {
        System.out.println(name + "is flying");
    }
}

