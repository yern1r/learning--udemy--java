package Multithreading.tasks;

import org.w3c.dom.ls.LSOutput;

public class Main {

    static boolean found = false;

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 1000000000);
        System.out.println(randomNumber);

        Thread guess = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!found) {
                    int guessedNumber = (int) (Math.random() * 1000000000);
                    if (guessedNumber == randomNumber) {
                        found = true;
                        System.out.println(guessedNumber);
                    }
                }
            }
        });

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (!found){
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {

                }
            }
        });
        timer.start();
        guess.start();
    }
}
