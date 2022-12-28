package OOP.Interfaces.anonymous;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        //anonymous class for 1 step using function
        boss.force(new Cookable() {//need object of class which
            //implements interface cookable
            @Override
            public void cook() {
                System.out.println("Cooking");
            }
        });

        //listener - look at event/function ,
        // if it started , listener will do some action
    }
}
