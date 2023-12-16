import java.time.LocalDate;

public class SwimmingAnimal extends Animal implements Swimable{
    public SwimmingAnimal(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
    @Override
    public double getSpeed() {
        return 5.0;
    }

    @Override
    public void toGo() {
        // Переопределение для плавающего животного
        swim();
        
    }
    public void swim() {
        System.out.println(name + "is swiming");
    }
}
