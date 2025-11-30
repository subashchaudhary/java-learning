import day1.JavaFunction;
import oop.*;
import oop.polymorphism.overriding.Animal;
import oop.polymorphism.overriding.CarnivorousAnimal;
import oop.polymorphism.overriding.HerbivorousAnimal;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{


    //This is the starting point for the application to run,
    //JVM used to call this method to start the application
    public static  void main(String arg[]){

        Fan fan = new Fan();
        fan.setType("table");
        fan.setColor("white");
        fan.setNoOfBlade(5);
        fan.setModelNumber("USHA27520");

        fan.start();
        System.out.println(fan);








//
//
//        System.out.println("Welcome to the virtual computer");
//        System.out.println("\n choose your laptop");
//
//        System.out.println("\n 1. Dell Laptop");
//        System.out.println("\n 2. Mac OS");
//
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//        Computer computer= null;
//
//
//        switch (choice){
//            case 1:
//                computer = new DellLaptop();
//                computer.start();
//                break;
//
//            case 2:
//                computer = new MacLaptop();
//                computer.start();
//                break;
//            default:
//                System.out.println("Wrong choice");
//
//        }
//



//        CellingFan cellingFan = new CellingFan();
//        cellingFan.setColor("Brown");
//        cellingFan.setModelNumber("CEL123");
//        cellingFan.setNoOfBlade(3);
//        cellingFan.setType("celling");
//
//
//        cellingFan.start();
//
//
//
//
//        TableFan fan1 = new TableFan();
//        fan1.setColor("White");
//        fan1.setModelNumber("TAB1234");
//        fan1.setNoOfBlade(5);



//        Fan fan1 = new Fan();  //object creation
//        fan1.setModelNumber("XYZ123");
//        fan1.setColor("Black");
//        fan1.setType("Celling");
//        fan1.setNoOfBlade(3);
//
//        Fan f2 = new Fan("abc141", "celling", "brown", 3);


//        System.out.println(cellingFan);
//        System.out.println(fan1);










//        JavaFunction object1 = new JavaFunction(); //object creation
//
//        JavaFunction object2 = new JavaFunction("Kanti Namuna"); //object creation
//
//
//
//        System.out.println(object1);
//
//        System.out.println(object2);
//








        //typecasting in java


//        int a = 10; //int type
//
//        long b = (long) a;  //implicit type casting





        //to read the value form the Console
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your name");
//        //this line used to read the data from the input and assign to variable
//        String name = scanner.next();
//        System.out.println("Welcome Mr. "+ name);
//
//        System.out.println("Enter your marks");
//        //this line used to read the data from the input and assign to variable
//        int obtainedMarks = scanner.nextInt();

//        int passingMarks = 45;
//        int fullMarks = 100;
//
//        // condition statement
//        if(obtainedMarks > passingMarks){
//            System.out.println("Congratulation Mr. " + name + " You are passed!");
//        }else{
//            System.out.println("Sorry you are failed!");
//        }


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
