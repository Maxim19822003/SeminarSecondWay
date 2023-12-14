import java.time.LocalDate;

public class FlyingAnimal extends Animal {
    public FlyingAnimal(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
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

