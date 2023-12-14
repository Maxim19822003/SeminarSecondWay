import java.time.LocalDate;

public abstract class Animal {
    
    protected String name;
    private Illness illness;
    private String ownerName;
    private LocalDate birthday;

    public Animal() {
    }

    public Animal(String name, Illness illness, String ownerName, LocalDate birthday) {
        this.name = name;
        this.illness = illness;
        this.ownerName = ownerName;
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Illness getIllness() {
        return illness;
    }

    private void toWakeUp() {
        System.out.println("Animal woke up");
    }

    private void eat() {
        System.out.println(getClass().getSimpleName() + " ate");
    }

    private void sleep() {
        System.out.println(getClass().getSimpleName() + " go to bed");
    }

    private void play() {
        System.out.println(getClass().getSimpleName() + " go to play");
    }

    public void liveCycle() {
        toWakeUp();
        eat();
        play();
        move();
        sleep();
    }
    public abstract void toGo();
    protected void move() {
        System.out.println(name + " is moving");
    }

    public void breathe() {
        System.out.println("breathe");
    }
}