package java8;

import java.util.Optional;

public class OptionalDemo {

    static void main(){

        //convert to upper


        Optional<Student> data = getData(); //

        if(data.isPresent()){
            Student student = data.get(); // null pointer exception
            System.out.println("Upperacase STR: "+ student.getName().toUpperCase());
        }


    }

    //lets assume this methods return null
    public static Optional<Student> getData(){
       Student s =  new Student();
       s.setName("amar");
        return Optional.ofNullable(s);
    }
}
