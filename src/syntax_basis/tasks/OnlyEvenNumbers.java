package syntax_basis.tasks;

public class OnlyEvenNumbers {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100){
            if (i % 2 == 0){
                System.out.println(i);
            }//check condition , if condition is true ...
            i++;// go for next number
        }
    }
}
