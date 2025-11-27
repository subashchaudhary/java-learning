package oop;

import java.util.Scanner;

public class MacLaptop implements Computer{
    @Override
    public void start() {
        System.out.println("press A button to start");

        Scanner sc = new Scanner(System.in);
       String input =  sc.next();
        if(input.equals("A")){
            System.out.println("Booting up you Mac");
        }else{
            System.out.println("Wrong input");
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
