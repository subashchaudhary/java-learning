package oop.exception;

import java.util.Scanner;

public class ExceptionDemo extends Object{

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Division");
        System.out.println("Enter first number");

        //syntax of try-catch
        try{
            //code to place if any chances of exception occurs
        }catch (Exception ex){
            //code to handle the exception
        }finally {
            //code to be executed always
        }


        try{
            //this is used to keep where is exception is used to occur
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number");
            int num2 = scanner.nextInt();

            int result =  num1 /num2;
            System.out.println("Result= :" + result);

        }catch(Exception ex){
            System.out.println("Wrong Input");
        }finally {// always executed
            System.out.println("Thank you for using our app");

        }






    }
}
