package java8;

public class Student implements Comparable<Student>{

    private String name;
    private String address;
    private int age;
    private int marks;
    private int rollNo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        //ascending sorting
        return Integer.compare(this.age, s.getAge());
    }
}


