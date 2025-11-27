package oop;

import java.util.Scanner;

//implements is a keyword which is used to implements (give body for the parent class/ Interface class)
public class DellLaptop implements Computer{


    @Override
    public void start() {
        System.out.println("press any key to start");
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        if(val != null){
            System.out.println("Booting your system....");
        }
    }

    @Override
    public void stop() {

    }

    @Override
    public void playVideo() {

    }

    @Override
    public void playMusic() {

    }

    @Override
    public void doCalculation(String operation, long number1, long number2) {

    }
}
