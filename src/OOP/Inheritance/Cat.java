package OOP.Inheritance;



public class Cat extends CatFamily {
    public Cat() {
        //setBigClaws(false);
        super(2,4,false);
    }

    @Override
    public void eat() {
        super.eat();// in order to use method of superclass in original
        System.out.println(" wis-kas");//method of subclass
    }

}
