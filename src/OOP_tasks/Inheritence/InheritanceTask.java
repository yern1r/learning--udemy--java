package OOP_tasks.Inheritence;

import OOP_tasks.Inheritence.Box.Box;
import OOP_tasks.Inheritence.Box.BoxWeight;

public class InheritanceTask {
    public static void main(String[] args) {
        Box box2 = new Box(10);
        BoxWeight box1 = new BoxWeight(10,10,10,20);
        //box1.showInfo();
        //box2.showInfo();
        System.out.println(box2);
    }
}
