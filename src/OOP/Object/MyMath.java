package OOP.Object;

public class MyMath {
    private static final double PI = 3.14;//static = related to class , not to object
    //we can not change value of final variable
    public static int square(int number){ //does not use variables of instance
        return number * number;
    }

    public static double length(double radius){//static variable available for static method
        //pi = 21 // this will destroy program , because
        // when we will use this pi after this
        // our pi will be equal to 21
        return  2 * PI * radius;
    }
    public static int sum(int ... numbers){//when we do not exactly how many
        //numbers will we have then we use (int ... numbers)
        int sum = 0;
        for (int i: numbers){
            sum += i;
        }
        return sum;
    }
}

class MainMath {
    public static void main(String[] args) {
        int square = MyMath.square(10);
        System.out.println(square);

        double length = MyMath.length(3.9);
        System.out.println(length);

        int summ = MyMath.sum(1, 3, 7 ,4 ,5);
        System.out.println(summ);
    }
}