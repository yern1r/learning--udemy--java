package OOP_tasks.FigureTask;

public class FigureRect extends Figure{
    //FigureReact must implement abstract method area() in figure class

    public FigureRect(int a, int b) {
        super(a, b);
    }
//to set same size for a and b
    public FigureRect(int size) {
        super(size,size);
    }
//we do not have access for variables , but we have getters
    @Override
    public int area() {
        return getA() * getB();
    }

}
