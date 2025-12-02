package collectionframework;


import java.util.*;

public class ListDemo {



    static void main() {

        Stack<Integer> numberStack = new Stack<>();

        numberStack.add(10);
        numberStack.add(20);
        numberStack.add(40);
        numberStack.add(22);

        System.out.println("Before remove elements");

        Iterator<Integer> numIterator = numberStack.iterator();
        while (numIterator.hasNext()){
            System.out.print(" "+ numIterator.next());
        }
        numberStack.remove(0); //deletion

        System.out.println("\n After remove element");


       for(Integer num: numberStack){
           System.out.println(num);
       }


        int peakElement = numberStack.peek();


        System.out.println("peak elements "+ peakElement);






        //Vector
//
//        Vector<String> vectorString = new Vector<>();
//        vectorString.add("user1");
//        vectorString.add("user2");
//
//        Iterator<String> iterator = vectorString.iterator();
//
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//
//        //LinkedList
//        LinkedList<Student> myLinkedList = new LinkedList<>();
//
//        Student s1 = new Student();
//
//       s1.setName("utkrish");
//       s1.setAge(24);
//
//        Student s2 = new Student();
//
//        s2.setName("Amar");
//        s2.setAge(33);
//
//        Student s3 = new Student();
//
//        s3.setName("utkrish");
//        s3.setAge(26);
//
//
//        //number short
//
//
//        for(int i = 0; i < myLinkedList.size(); i ++){
//
//            //
//        }
//
//        for (int i = 0; i < myLinkedList.size(); i++){
//            System.out.println(myLinkedList.get(i));
//        }
//
//
//
//
//
//
//
//
//
//
//        //ArrayList class
//        //Generic <Type>
//
//        ArrayList<Integer> numberList = new ArrayList<>();
//        numberList.add(200);
//        numberList.add(50);
//        numberList.add(22);
//
//        //merging two list
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(4);
//        list2.add(30);
//        numberList.addAll(list2); //combined two list.
//
//
//       Iterator<Integer> listIterator =  numberList.iterator();
//
//        while(listIterator.hasNext()){
//
//            System.out.println("from iterator: " + listIterator.next());
//        }
//
//
//
//
//
//        boolean isPreset = numberList.contains(4);
//
//
//
//
//
//
//
//
//        System.out.println(numberList.indexOf(new Integer(4)));
//
//        System.out.println(numberList.isEmpty());
//
//
//
//
//       // System.out.println(grades.toString());
//
//        for(int i = 0; i< numberList.size(); i++){
//            System.out.println(numberList.get(i) );
//        }
//
//        System.out.println("Learning on The Collection Framework");

    }
}
