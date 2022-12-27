package OOP_tasks.FigureTask;

public class FigureTriangle extends Figure{

    private int c;

    public FigureTriangle(int a, int b , int c) {
        super(a, b);
        this.c = c;
    }

    public FigureTriangle(int size){
        super(size,size);
        this.c = size;
    }

    @Override
    public int area() {
        int s = (getB() + getA() + c ) / 2;
        return s ;
    }
}
