package OOP.Collections;

import java.util.ArrayList;

public class CollectionArrayList {
    //only one data type


}

class CollestionRun{
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();//<data type>
        employees.add("Alex");
        employees.add("Alexandr");
        employees.add("Alexei");
        employees.add("Max");
        employees.add("Maxim");

        employees.remove(2);
        employees.remove("Max");

       // for(int i = 0; i < employees.size(); i++){//size() = return quantity of element in lsit
         //   System.out.println(employees.get(i)); //get() = return element/value by index i
        // }

        for (String names: employees) { //starts i = 0, then automatically i++ to next index = 1
            System.out.println(names);
        }
        //use arraylist for dynamic purposes
        ArrayList<Integer> numbers = new ArrayList<>();// only Wrappers , no primitives
        for (int i = 0 ; i < 10; i++){
            numbers.add(i);//add integer i in array
        }
        int quantity = 0;
        int sum = 0;
        for (int i : numbers) {// sout by indexes
            System.out.println(i);
            quantity++;
            sum += i;
        }
        System.out.println("total numbers: " + quantity);
        System.out.println("their sum: " + sum);

    }
}
