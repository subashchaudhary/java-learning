package oop;

public class CellingFan extends Fan{


    private int heightOfRod;
    //super keyword

    public CellingFan(){
        System.out.println("Child Constructor called");
    }

    public CellingFan(String modelNumber, String color, String type, int noOfBlades, int heightOfRod){
        super(modelNumber, color, type, noOfBlades);
        this.heightOfRod = heightOfRod;
    }

    public void start(){
        super.start();
    }




}
