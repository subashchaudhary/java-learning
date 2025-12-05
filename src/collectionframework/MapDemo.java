package collectionframework;

import oop.DellLaptop;

import java.util.*;

public class MapDemo {


    static void main() {


        //Map in Java
        Map<String, Object> myMap = new HashMap();

        myMap.put("name", "Subash"); //entryset
        myMap.put("age", 28);
        myMap.put("email", "test@gmail.com");
        myMap.put("adress", "yogikuti, butwal");
        myMap.put("laptop",new DellLaptop());
        myMap.put("optionalemail", null);
        myMap.put(null, "test");

        //accessing map values using EntrySet
        Set<Map.Entry<String, Object>> entrySet= myMap.entrySet();
        System.out.println("\n\n\n using entrySet()");

        for(Map.Entry eachEle :entrySet){
            System.out.println(eachEle.getKey() + " : " + eachEle.getValue());
        }

        //accessing map values using keyset();

        Set keySet = myMap.keySet();
        System.out.println("\n\n\n using keyset()");
        for(Object ele : keySet){
            System.out.println(ele + " : " + myMap.get(ele));
        }

        //gives size of map
        myMap.size();
        //get value for given key
        myMap.get("name");
        //clear map
        myMap.clear();
        //return true  if the given key is present or fasle
        myMap.containsKey("name");
        //check empty
        myMap.isEmpty();
        //remove from map
        myMap.remove("name");
        myMap.replace("name", "Amar");
        Collection value = myMap.values();

        //LinkedHashMap
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name", "Subash"); //entryset
        linkedHashMap.put("age", 28);
        linkedHashMap.put("email", "test@gmail.com");
        linkedHashMap.put("adress", "yogikuti, butwal");
        myMap.put("optionalemail", null);

        System.out.println("\n Example for LinkedHashMap::");
        Set<Map.Entry<String, Object>> linkedHashMapEntry = linkedHashMap.entrySet();
        for(Map.Entry eachEle :linkedHashMapEntry){
            System.out.println(eachEle.getKey() + " : " + eachEle.getValue());
        }


    }
}
