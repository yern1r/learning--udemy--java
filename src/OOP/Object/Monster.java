package OOP.Object;

public class Monster {

    int eyes;
    int arms;
    int legs;

    public Monster() {
        this.arms = 2;
        this.arms = 2;
        this.legs = 2;
    }

    public Monster(int eyes){
        this.eyes = eyes;
    }

    public Monster(int eyes, int arms){
        this.eyes = eyes;
        this.arms = arms;
    }

    public  Monster(int eyes, int arms, int legs){
        this.eyes = eyes;
        this.arms = arms;
        this.legs = legs;
    }

    void voice(){
        System.out.println("Voice");
    }

    void voice(int i ){
        for (int j = 0; j < i ; j++){
            System.out.println("Voice");
        }
    }

    void voice(int i , String word){
        for (int j = 0; j < i; j++){
            System.out.println(word);
        }
    }
}

class seeResult{
    public static void main(String[] args) {

    Monster monster = new Monster();
    Monster monster1 = new Monster(3);
    Monster monster2 = new Monster(4,4);
    Monster monster3 = new Monster(5,5,5);

    monster.voice(1,"Booo");
    monster1.voice();
    monster3.voice(5, "Siu");
    monster2.voice(3);

    }
}