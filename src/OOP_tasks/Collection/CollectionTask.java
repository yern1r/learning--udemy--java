package OOP_tasks.Collection;

import java.util.ArrayList;


public class CollectionTask {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1 ; i <= 10; i++){//to add 10 numbers without repeating same code 10 times
            numbers.add(i);//just using loop for repeating action, starts with 1
        }
        //System.out.println(numbers);


        ArrayList<String> names = new ArrayList<>();
        names.add("Max");//index 1
        names.add("Maxim");
        names.add("Maximer");
        names.add("Alex");
        names.add("Alexsandr");
        names.add("Alexsandro");
        names.add("Maximeninko");
        names.add("Maxat");
        names.add("Maxcat");
        names.add("Maxsi");//index 10

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++){//size = 10
            String saving = numbers.get(i) + " - " + names.get(i);//take string value and inputting into saving variable
            // by combining numbers and names
            result.add(saving);
            //then use this variable as whole one string type value
            //so we can just add it into array list as simple string data type value
        }

        for (String s : result) {//just output values at that index
            System.out.println(s);// by one , index++
        }

    }

}
