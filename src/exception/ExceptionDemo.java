package exception;

import java.util.Scanner;

public class ExceptionDemo {


    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to divide");
        System.out.println("Enter number 1");
        String number = sc.next();
        System.out.println("Enter number 2");
        String divder = sc.next();

        try {
           int result =  divide(number,divder);
           System.out.println("Ans: " + result);
        } catch (MyCustomException e) {
            System.out.println("Exception occurs: " + e);
        }finally{
            System.out.println("Thank you!");
        }
    }

    public static int divide(String num1, String num2) throws MyCustomException{
        if(num1 == null && num2== null){

        throw new MyCustomException("Invalid number: Value should be number value");
        }
        try{
            int n1  = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            return n1/n2;

        }catch (NumberFormatException ex){
            throw new MyCustomException("Invalid number: Value should be number value");
        }
    }

}

