package Multithreading;

public class Main {

    static  boolean isFive = false;

    public static void main(String[] args) {

        //RunnableTimer runnableTimer = new RunnableTimer();
        // creating object then give it as parameter

        //new flow
        Thread timer = new Thread(new Runnable(){ //anonymous class
            @Override
            public void run() {
                    try{
                        for (int i = 0; i < 10000; i++) {
                            System.out.println(1);
                            Thread.sleep(1000);
                        }
                    }catch (Exception e){

                    }

                }
        });
        //timer.start();

        Thread timer2 = new Thread(new Runnable(){ //anonymous class
            @Override
            public void run() {
                try{
                    int i = 0;
                    while (true) {
                        if (i == 5){
                            isFive = true;
                        }
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                }catch (Exception e){

                }

            }
        });
        timer2.start();

        Thread timer3 = new Thread(new Runnable(){ //anonymous class
            @Override
            public void run() {
                try{
                    int i = 0;
                    while (!isFive) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                }catch (Exception e){

                }

            }
        });
        timer3.start();

    }
}
