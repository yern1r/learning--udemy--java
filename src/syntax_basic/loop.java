package syntax_basic;

public class loop {
    public static void main(String[] args) {
        int i =0;
        do {
            System.out.println("Hello");
        }while(i > 0);

        int count = 0;
        for (int j = 10; j <=100 ; j++){
            if (j % 5 == 0){
                System.out.println(j);
            }
        }

    }
}
