package java8;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

/*

Java 8:

1) Functional Interface



//characteristic of interface
1. All the member functions are public abstract
2. All the member variables are static final




 */
public class Demo {


    static void main(){

     AnotherInterface obj1 = (n1, n2) -> n1 + n2;
     int result =    obj1.add(2, 5);
     System.out.println("Sum is = " + result);


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println("All elements  in the list");
        for(Integer n : list1){
            System.out.println(n);
        }

        System.out.println();


        //stream api

        System.out.println("Event numbers from above list:\n");
        List<Integer> evenList = list1.stream().filter(n-> n%2 == 0).toList();

        for(Integer n : evenList){
            System.out.println(n);
        }

        Function<? super Integer, ? extends Integer> fun1 = new Function<Object, Integer>() {
            @Override
            public Integer apply(Object o) {
                return (Integer) o * 2;
            }


        };

        List<Integer> doubleNumbers = (List<Integer>) list1.stream().map(n-> n*2).toList();

        System.out.println("double number list");
        for(Integer n : doubleNumbers){
            System.out.println(n);
        }



    }

}


@FunctionalInterface
interface AnotherInterface{

    int add(int num1, int num2);
}




 class A implements AnotherInterface{

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}




interface Interface1{

    public static final int NUM = 10;

    abstract void show();

    void print();

    void print(String srt);

}