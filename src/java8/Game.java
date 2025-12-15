package java8;

import java.util.List;

//Default and static method in java 8;


public interface Game {


    public abstract void run();
    public abstract List<String> fetchGame();

    //default methods
    default public void playSnakeGame(){
        System.out.println("Snake Game loading...");
    }

    default public void xyz(){
        System.out.println("Snake Game loading...");
    }


    //static method
    static void scanData(){
        System.out.println("Invoking static method.");
    }
}
