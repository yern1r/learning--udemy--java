package syntax_basic;

public class Cycle {
    public static void main(String[] args) {

    int i = 1;
        while (i <= 10) {
            if (i == 7){ // i want to skip 7
                i++;//so if i = 7 , add 1 and make it 8
            }
            System.out.println(i);// i=1
            i++;// i=1+1
        }
    }
}
