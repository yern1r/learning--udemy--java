package OOP.Object;

public class Overloading {
    //overloading methods(for constructor same) - has same names but different type of or quantity of parameters or return type
    //if method will work same and will not depend on objects , variables ; so we can use static
   static int multiplication(int a ,  int b){
       return a * b;
   }

   static double multiplication(double a , double b){
       return a * b;
   }

   static int multiplication(int a){
       return a * a;
   }
}

class Process{
    public static void main(String[] args) {
       /* OOP.Object.Overloading test = new OOP.Object.Overloading();
        int res = test.multiplication(4);
        int res2 = test.multiplication(4, 3);
        double res3 = test.multiplication(3.4, 4.3);*/

        //so if we use static we do not need to create object

        int res = Overloading.multiplication(2);
        int res2 = Overloading.multiplication(3, 3);
        double res3 = Overloading.multiplication(4.5, 10.5);
        System.out.println(res + "\n" + res2 +"\n" + res3);
    }
}
//no to double writing code(doubling)