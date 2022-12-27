package OOP.Inheritance;

import OOP.Inheritance.Inheritance.Cat;
import OOP.Inheritance.Inheritance.Lion;

public class Inheritance {
    //has methods, variables in common
    public static void main(String[] args) {
        Cat cat  = new Cat();
        Lion lion = new Lion();

        //System.out.println(lion.legs);
        //System.out.println(cat.bigClaws);

        cat.showInfo();
        lion.showInfo();

        cat.eat();
        lion.eat();
    }

}
