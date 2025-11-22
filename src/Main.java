
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static  void main(String arg[]){

        //to read the value form the Console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        //this line used to read the data from the input and assign to variable
        String name = scanner.next();
        System.out.println("Welcome Mr. "+ name);

        System.out.println("Enter your marks");
        //this line used to read the data from the input and assign to variable
        int obtainedMarks = scanner.nextInt();

        int passingMarks = 45;
        int fullMarks = 100;

        // condition statement
        if(obtainedMarks > passingMarks){
            System.out.println("Congratulation Mr. " + name + " You are passed!");
        }else{
            System.out.println("Sorry you are failed!");
        }


        //single line comment

        /*
        This is multi line comments
        long decription
         */


        //variables declaration alpha number (go through the variable name declaration rules
//
//        int age = 10;
//        String name = "Ram";
//        char a = 'Q';
//        boolean isTrue = true;
//        double pi = 3.141f;
//
//
//
//        int passingMarks = 45;
//        int obtainedMarks = 77;
//        int fullMarks = 100;
//
//        // condition statement
//        if(obtainedMarks > passingMarks){
//            System.out.println("Congratulation You are passed!");
//        }else{
//            System.out.println("Sorry you are failed!");
//        }
//
//        if(obtainedMarks > 35 && obtainedMarks < 45){
//            System.out.println("poor");
//        }else if(obtainedMarks > 45 && obtainedMarks < 80){
//            System.out.println("average");
//        }else if(obtainedMarks>80 && obtainedMarks < 100){
//            System.out.println("Excellent");
//        }else{
//            System.out.println("failed");
//        }
//
//        //looping
//        //for loop
//        //syntax: for(initilazition; condition; increent/decement)
//        int i;
//        for(i = 1; i <= 10; i++){
//            System.out.println("Hellow Times "+ i);
//        }
//
//        char[] alphabet= new char[4];
//        alphabet[0] = 'A';
//        alphabet[1] = 'B';
//        alphabet[2] = 'C';
//        alphabet[3] = 'D';
//
////        for(int j = 0; j < alphabet.length; j++){
////            System.out.println(" "+ alphabet[j]);
////        }
//
//        //enhanced for loop
//        for(char c : alphabet){
//            System.out.println(c);
//        }
//
//        //while loop
//
//
//        while(obtainedMarks < 80){
//
//
//            //condition to break the loop;
//            System.out.println("Inside while loop");
//            obtainedMarks ++;
//        }
//
//        //do- while loop
//
//        do{
//
//            System.out.println("Inside do while loop");
//
//        }while (obtainedMarks< 80);
//
//
//        //switch
//        char value = 'A';
//        switch (value){
//            case 'A':
//                System.out.println("case 1");
//                break;
//            case 'B':
//                System.out.println("case 2");
//                break;
//
//            case 'C':
//                System.out.println("case 3");
//                break;
//
//            default:
//                System.out.println("Default case execution");
//                break;
//        }

        //++a; a++, --a, a-- (post and pre incremet)

        //arithmetic expression
        // + - * / %
        // && || < , > <= , >= , ==









    }


}
