import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Cat
        Cat cat = new Cat();
        cat.setName("Barsic");
        System.out.println(cat.getName());
        cat.liveCycle();

        // Создание объекта Dog
        Dog dog = new Dog("Max", new Chuma("Chuma"), "Petr", LocalDate.of(3, 12, 21));
        dog.liveCycle();

        // Создание объекта Duck
        Duck duck = new Duck("Ducky", null, "Jane", LocalDate.now());
        duck.liveCycle();
        duck.swim();
        duck.fly();

        // Создание объекта SwimmingAnimal
        SwimmingAnimal fish = new SwimmingAnimal("Goldfish", null, "Alice", LocalDate.now());
        fish.liveCycle();
        fish.swim();

        // Создание объекта Cat
        // Cat cat = new Cat();
        // cat.fly(); // Этот вызов не выполнит никаких действий, так как метод не
        // реализован в классе Cat
    }
}
