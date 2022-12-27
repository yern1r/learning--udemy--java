package syntax_basic;

public class Integer {
    public static void main(String[] args) {
        //variable - it is a box of data/memory which has name
        // ex : box of toothbrush - is variable , there can be toothbrush or can be empty
        // toothbrush - will be value of variable
        // type_data name_of_variable;
        int a;
        a = 9;
        // = --> assign ,
        // name_of_variable = value; data_type name_of_variable = value;
        int b = 5;
        int c = a + b ;
        c = c + 6; // c += 6;
        b = 12; a = 5; c = b / a ;
        System.out.println(a + b);
        System.out.println("c = " + c);
    }
}
