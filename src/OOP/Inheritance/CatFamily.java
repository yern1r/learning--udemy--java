package OOP.Inheritance;

public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;

    //public CatFamily() {
      //  ears = 2;
        //legs = 4;
        //bigClaws = true;
    //} //if there is no empty constructor
    // = we should use super() constructor with right parameters

    public void showInfo() {
        System.out.println("Ears: " + ears + " Legs: " + legs + " Claws: " + bigClaws);
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    public void eat(){
        System.out.println("Eating");
    }
}
