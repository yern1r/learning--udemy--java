package OOP.Inheritance;



public class Lion  extends CatFamily {
    public Lion() {
    super(2,4,true);
    //super = it is constructor for extended classes
    }

    public void eat(){
        super.eat();
        System.out.println(" mal");
    }
}
