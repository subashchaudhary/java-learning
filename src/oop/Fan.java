package oop;

public class Fan {


    public Fan(){
        System.out.println("Constrctor called");
    }

    //paramaterize constrctor

    public Fan(String modelNumber, String type, String color, int noOfBlade){
        this.modelNumber = modelNumber;
        this.type= type;
        this.color = color;
        this.noOfBlade = noOfBlade;
    }
    //member variables

   protected String modelNumber;
   private String type;
   private String color;
   private int noOfBlade;


   public void setModelNumber(String modelNumber){
       this.modelNumber = modelNumber;
   }
   public String getModelNumber(){
       return this.modelNumber;
   }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfBlade() {
        return noOfBlade;
    }

    public void setNoOfBlade(int noOfBlade) {
        this.noOfBlade = noOfBlade;
    }

    //member function
    public void start(){
        System.out.println("Fan started!!");
    }

    public void stop(){
        System.out.println("Fan Stopped!");
    }


    @Override
    public String toString() {
        return "Fan{" +
                "modelNumber='" + modelNumber + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", noOfBlade=" + noOfBlade +
                '}';
    }
}
