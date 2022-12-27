package OOP.Object;

public class Methods {
    //type nameMethod(list_of_parameters){body}
    //type = type of data which method returns(int,boolean,object) + keyword return;
    //void = does not return anything(no data), just execute
    //parameters = variables with suitable data type
    //()=empty brackets does not need any parameters

    String nameMethod = "Area";
    int length;
    int width;

    int calculateArea(){//gets data but does not show
        return length * width;
    }

    void showArea(){//just show on screen
        int area = length * width;
        System.out.println(area);
    }
}

class Math{
    public static void main(String[] args) {
        Methods doSomeMath = new Methods();
        doSomeMath.width = 7;
        doSomeMath.length = 7;
        doSomeMath.showArea();

        Methods doSomeMathematics = new Methods();
        doSomeMathematics.length = 10;
        doSomeMathematics.width = 10;
        doSomeMathematics.showArea();

        int checkArea = doSomeMath.calculateArea() + doSomeMathematics.calculateArea();//save value of calculateArea()
        System.out.println(checkArea);
    }
}
