package OOP.Object;

public class Parameters {
    //rectangle
    double length;
    double width;

    void getParameters(int length, int width){//this method will not return anything , then we are using void
        this.length = length;// we have same name of parameters and variables,
        this.width = width;//but with  this. we can show that we use instance's variables
    }

    double perimeterCalculate(){
        return length + width / 2;
    }

    double areaCalculate(){
        return length * width;
    }
}

class Mainbai {
    public static void main(String[] args) {
        Parameters rectangle = new Parameters();
        rectangle.getParameters(15, 15);//command + p to see parameters
        double perimeter = rectangle.perimeterCalculate();
        double area = rectangle.areaCalculate();
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
