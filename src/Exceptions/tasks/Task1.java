package Exceptions.tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        System.out.println("Input number: ");
        Scanner inputtedNumber = new Scanner(System.in);
        int number = inputtedNumber.nextInt();
        try {
            int array[] = {1, 2 , 3, 4};
            System.out.println(array[number]);
        }catch (IndexOutOfBoundsException error) {
            System.out.println("Array has not index : " + number);
        }finally {
            System.out.println("task is finished");
        }
    }
}
