package OOP.Interfaces;

import java.util.ArrayList;

public class Interface {
    public static void main(String[] args) {
        DogInterface dog = new DogInterface();
        CatInterface cat = new CatInterface();
        BirdInterface bird = new BirdInterface();
        FishInterface fish  = new FishInterface();

        ArrayList<Animalnterface> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(fish);
        animals.add(bird);

        //polymorphism is using same method for different class
        // but results of method was different with different classes
        for (Animalnterface animal:
             animals) {
            animal.eat();
        }

        //upcast
        //we can give type of super class to  subclass
        //Animalnterface animal = new DogInterface();

        DogInterface dog2 = new DogInterface();
        dog2.run();

        Animalnterface animal = dog2;
        //downcast
        dog2 = (DogInterface) animal;

        CatInterface cat2 = new CatInterface();
        BirdInterface bird2 = new BirdInterface();

        ArrayList<CanRunInterfaces> runners = new ArrayList<>();
        runners.add(dog2);
        runners.add(cat2);
        runners.add(bird2);

        for (CanRunInterfaces runAnimals:
             runners) {
            runAnimals.run();
        }


        DogInterface dog3 = new DogInterface();
        CanRunInterfaces CanRun = dog3;
        //CanRun.eat(); error bcoz there is no eat method in interface
        dog3 = (DogInterface) CanRun;//down cast
        dog3.eat();

        Flyable flyable = new BirdInterface();
        flyable.fly();
    }
}
