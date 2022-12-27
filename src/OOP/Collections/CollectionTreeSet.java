package OOP.Collections;

import java.util.TreeSet;

public class CollectionTreeSet {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Van de Bek");//no duplicated values
        names.add("Van de Bek");//only return 1 value
        names.add("Wang de Bek");//return in order,sorted
        // in this case alphabetic
        names.add("Man de Bek");
        //no get() method , only for each
        names.add("Jan de Bek");
        // slower than hash set

        for (String eachName:
             names) {
            System.out.println(eachName);
        }

    }
}
