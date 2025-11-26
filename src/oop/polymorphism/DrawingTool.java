package oop.polymorphism;

//polymorphism: multi form:
//TYPES: 1 . Method Overloading, 2. Method Overriding


public class DrawingTool {


    private String pencil;
    private String paint;
    private String marker;
    private String colorPen;


    //method overloading

    //draw() method with no arguments

    public void draw(){
        System.out.println("Drwing with pencil");
    }

    //draw method with single argument

    public void draw(String pencil){
        System.out.println("Drwing with pencil");
    }

    //draw method with multiple argument
    public void draw(String pencil, String colorPen){
        System.out.println("Drwing with pencil and coloring with colorpen");
    }

}

/**
 *
 * Develop an application Calculator that takes input form
 * user and do the below operation
 *
 * Also save the history and try to get the older history based on user
 *
 * (Try to utilize the OOP concepts)
 *
 * (addition)
 * (subtraction)
 * (multiplication)
 * (division)
 * (percentage)
 * (average)
 * (mean)
 * (median)
 * (mode)
 * (leapYear)
 * (showHistory)
 *
 *
 */
