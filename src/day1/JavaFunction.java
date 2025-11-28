package day1;


//class definition
public class JavaFunction extends Object{


    //properties : (member variables)
    private String collegeName;


    //constructor (default constructor)
    public JavaFunction(){
        System.out.println("Default constructor called");
    }

    //parameterized constructor( used incase you want to initialize the data
    // during object creation

    public JavaFunction(String name){
        System.out.println("Parameterized constructor called");

        this.collegeName = name;
    }






    //method of return type
    public String getName(){

        //return data from this method
        return collegeName;
    }

    //function (no-arg functions) also no return
    public void show(){
        System.out.println("hellow, ");
    }

    //argument function also no return tyep
    public void show(String name){

        System.out.println("hellow, "+ name);
    }

    //argument function (method overloading)
    public void show(String name, String address, String phone){


        System.out.println("hellow, "+ name + "from : "+ address + " phone no: "+ phone);
    }







    @Override
    public String toString() {
        return "JavaFunction{" +
                "collegeName='" + collegeName + '\'' +
                '}';
    }
}
