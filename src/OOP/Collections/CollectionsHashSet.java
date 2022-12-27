package OOP.Collections;

import java.util.HashSet;

public class CollectionsHashSet {
    public static void main(String[] args) {
        //no duplicated values in collections
        HashSet<String> names = new HashSet<>();
        //we can not use get()
        names.add("John");
        names.add("Jonny");
        names.add("Johnbek");
        names.add("Johnbai");
        names.add("Jonny");//output only one Jonny
        for (String name:names) {//will output randomly
            System.out.println(name);
        }
    }
}
