package OOP.Interfaces;

public class BirdInterface extends Animalnterface implements CanRunInterfaces, Flyable {
    @Override
    public void eat() {
        System.out.println("Eating beard");
    }

    @Override
    public void run() {
        System.out.println("Bird runs");
    }

    @Override
    public void fly() {
        System.out.println("Bird flies");
    }
}
