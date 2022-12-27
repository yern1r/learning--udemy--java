package OOP.Interfaces;

import OOP.Interfaces.Animalnterface;
import OOP.Interfaces.CanRunInterfaces;

public class DogInterface extends Animalnterface implements CanRunInterfaces {
    @Override
    public void eat() {
        System.out.println("Eating bone");
    }

    public void run(){
        System.out.println("Dog runs");
    }
}
