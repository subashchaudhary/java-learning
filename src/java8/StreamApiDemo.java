package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiDemo {



    static void main(){

//        Stream<Integer> myStream =
        //using stream api to process collection data

       List<Integer> numList = List.of(1, 2,3,4,5,7);

       //mapper (map() to transform data)
       List<Integer> doublNums =  numList.stream().map((element) -> element * 2).toList();

       for(Integer i : doublNums){
           System.out.println(i);
       }
       //filter
        numList.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer %2 == 0;
            }
        });

       long totalCount = numList.stream().count();

       //parked for later
       numList.stream().sorted();

       //flat map

        // List of lists of names
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

       System.out.println(listOfLists);

      List<String> finalList= (List<String>) listOfLists.stream().flatMap(ele -> ele.stream()).map(e -> e).toList();

      System.out.println(finalList);
    }
}
