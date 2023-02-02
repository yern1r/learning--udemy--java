package Multithreading.tasks;

public class RunnableTimer implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 61 ; i++){
            System.out.println(i);
        }
    }
}
