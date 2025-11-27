package oop;

public interface Computer {


    public abstract void start();

    public abstract void stop();

    public abstract void playVideo();

    public abstract void playMusic();

    public abstract void doCalculation(String operation, long number1 , long number2);


    //java 8: default function and static function
    public default void videoCall(){

    }


}
