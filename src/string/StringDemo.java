package string;

import java.util.Locale;
import java.util.stream.IntStream;

public class StringDemo {


    static void main(){


        String str = "Hellow I am a java developer.";

        //how to define string
        //method 1: String literal

        String name = "santosh";

        //during object creation it will check if "santosh" is presnt
        //if yes then it point to same object
        String name2 = "santosh";

        //method 2: using new operator

        String abc = new String("test");



        //note: String is immutable once the string is defined
        //we cannot change its value

        //string operations methods:
        //1. string concatination
        String finalStr = str.concat("I like java coding");

        System.out.println(finalStr);


        //2. check the same string
        boolean isEqual = name.equals("santosh");

        //ternary operation

        if(5 > 2){

        }else{

        }

        //corresponding ternary expression
        String check =  (5 > 2) ? "true" : "false";

        System.out.println("names are equal ? = "+ (isEqual ? "yes" : "no"));

        //3. check if string is empty or blank
        System.out.println(" ".isEmpty()) ;
        System.out.println(" ".isBlank()) ;

        //4.lower case conversion

        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase : " + lowerStr);

        //5. upper case conversion
        String upperStr = str.toUpperCase();
        System.out.println("UpperCaser str : " + upperStr);

        //6. equalsIgnoreCase()

        System.out.println("\"A\".equals(\"a\")  = "+ "A".equals("a"));

        System.out.println("\"A\".equalsIgnoreCase(\"a\") = " + "A".equalsIgnoreCase("a"));


        //7. get character at given index.
        char ch = str.charAt(0);
        System.out.println("character at index 0 is : " +ch);

        //8. contains()

        boolean isContained = str.contains("JAVA");
        System.out.println("isContained : " + isContained);








    }
}
