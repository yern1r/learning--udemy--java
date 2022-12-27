package OOP.Interfaces;

import OOP.Interfaces.Animalnterface;
import OOP.Interfaces.CanRunInterfaces;

public class CatInterface extends Animalnterface implements CanRunInterfaces {
    @Override
    public void eat() {
        System.out.println("Eating wis-kas");
    }

    @Override
    public void run() {
        System.out.println("Cat runs");
    }
}
