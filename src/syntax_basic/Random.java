package syntax_basic;

public class Random {
    public static void main(String[] args) {

        /*double random = Math.random();
        random *= 6;

    //Transfer into integer
        int randomInt = (int) random;
        randomInt ++;
        System.out.println(randomInt);*/

        //random number between 10 - 100
        //in order to not get 10 every time
        int random = (int) (Math.random() * 90 + 10);
        String result = String.format("Random number is %s. Let's try one more", random);
        System.out.println(result);

    }
}
