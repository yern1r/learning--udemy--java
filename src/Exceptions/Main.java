package Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 0;

        try{ //after finding first error/exception, our program leave try
            int b = 7 / a;
            String s = "12fkfkf";
            int i = Integer.parseInt(s);
        } catch (ArithmeticException e){// and go to the catch
            System.out.println("Cannot by zero");
        }catch (NumberFormatException e2){
            System.out.println("Error in formatting");
        }catch (Exception e3){
            System.out.println("Catch all of error/exception without specific exception type");
        }//after this all catches will be ignored
        finally {//not depended on catches
            System.out.println("Finally");
        }

        System.out.println("Hello");


        //-----task-----

    }
}
