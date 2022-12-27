package OOP.Object;

public class Dog {
    String nameDog;
    String typeDog;
    int speed;

    void showRun(){
        for (int i = 0 ; i < speed; i++){
            System.out.println("Run");
        }
    }

    String info(){
        return  nameDog + "," + typeDog + "," + speed;
    }
}
class Mainbek {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.speed = 4;
        dog1.typeDog = "Gold";
        dog1.nameDog = "Altynbek";

        dog1.showRun();

        String information = dog1.info();
        System.out.println(information);
    }
}