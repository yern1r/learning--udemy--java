package OOP_tasks.FigureTask;

import OOP_tasks.FigureTask.FigureRect;

public class ColorRect extends FigureRect {
    public ColorRect(int a , int b){
        super(a,b);
    }
    public ColorRect(int size){
        super(size,size);
    }
    //we do not have problem with method area(), because our super class already did it
}
