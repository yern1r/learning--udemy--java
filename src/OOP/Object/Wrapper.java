package OOP.Object;


class RunWrapper{
    public static void main(String[] args) {
        //int a = 5;//primitive type
        //syntax_basic.Integer b = 5;//linked type//wrapper class

        String number = "100";
        String number2 = "67";
        int takeNumber = java.lang.Integer.parseInt(number);
        int takeNumber2 = java.lang.Integer.parseInt(number2);

        System.out.println(takeNumber2 + takeNumber);

        String s = "Bob is IT scientist";
        String name = s.substring(0,4);
        System.out.println(name);
    }
}