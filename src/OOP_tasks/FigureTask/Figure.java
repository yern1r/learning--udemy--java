package OOP_tasks.FigureTask;
//if we will use final keyword for class = if want to not allow to inheritance
public abstract class Figure { //if in class has abstract method,
    //class also must be abstract
    //if we wanna use class as super class/ parent class
    //and , we want to be not allowed to create object from this class
    // therefore this class must be abstract class
    //we can not create just figure , we can only create concrete figures
    private int a;
    private int b;

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract int area();//if method has not own realization
    //and must be overrided, so we should use abstract
    //if we want to method be override, we use abstract keyword


    //in order to calculate area , we should have access for a,b
    public final int getA() {//we use final
        //in order to not give access for overriding method
        return a;
    }

    public final int getB() {
        return b;
    }

    //final for variable to not change
}

class FigureMain{
    public static void main(String[] args) {
        FigureRect figure = new FigureRect(5,10);
        FigureTriangle figurik = new FigureTriangle(10);

        System.out.println(figure.area());
        System.out.println(figurik.area());
    }
}