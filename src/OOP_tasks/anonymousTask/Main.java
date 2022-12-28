package OOP_tasks.anonymousTask;

public class Main {
    public static void main(String[] args) {
        //1st variant
        Boss boss = new Boss();
        boss.force(new Counter() { //calling force method which
            //take arguments Counter interface and int i
            //then override interface method to this...
            @Override
            public String report(int months) {
                return  "We agreed with 3 companies in " + months + " months" ;
            }
        },6);//and give a value to i

        //2nd variant
        MyCounter counter = new MyCounter();
        boss.force(counter,7);
    }
}
