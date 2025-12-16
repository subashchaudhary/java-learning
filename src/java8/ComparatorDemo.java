package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {


    static void main(){


        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student();
        s1.setName("Sabin");
        s1.setAddress("Bhairahawa");
        s1.setAge(24);
        s1.setMarks(77);
        s1.setRollNo(4);

        Student s2 = new Student();
        s2.setName("Utkris");
        s2.setAddress("Manigram");
        s2.setAge(22);
        s2.setMarks(87);
        s2.setRollNo(2);

        Student s3 = new Student();
        s3.setName("Amar");
        s3.setAddress("Manigram");
        s3.setAge(24);
        s3.setMarks(80);
        s3.setRollNo(1);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        for(Student student : studentList){
            System.out.println(student);
        }

        //after sorting
        //natural sorting using
        System.out.println("After sorting");
        List<Integer> l1 = List.of(2,4,1,5,6);
        //In build natural sorting
        Collections.sort(studentList);

        for(Student student : studentList){
            System.out.println(student);
        }


        ///Comparator demo

        List<Teacher> teachers = new ArrayList<>();
        Teacher t1 = new Teacher();
        t1.setName("Sabin");
        t1.setAddress("Bhairahawa");
        t1.setAge(25);
        t1.setEmpId(244);
        Teacher t2 = new Teacher();
        t2.setName("Amar");
        t2.setAddress("Butwal");
        t2.setAge(25);
        t2.setEmpId(122);
        Teacher t3 = new Teacher();
        t3.setName("Utkrish");
        t3.setAddress("Bhairahawa");
        t3.setAge(29);
        t3.setEmpId(22);

        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);

        System.out.println("Teachers list" );
        for(Teacher teacher : teachers){
            System.out.println(teacher);
        }

        //After using comparator

        Collections.sort(teachers,new AgeComparator());
        Collections.sort(teachers,new IdComparator());
        System.out.println("After using comparator: \n Teachers list" );
        for(Teacher teacher : teachers){
            System.out.println(teacher);
        }

    }
}
