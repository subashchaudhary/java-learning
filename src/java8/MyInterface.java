package java8;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Objects;

public interface MyInterface {


    public void show();

    public static void play(){
        System.out.println("Started playing");

    }

    public default void print(String text){
        System.out.println(text);
    }
}

class MyClass implements MyInterface{


    static void main() {

       Pen p1 = new Pen();
       p1.setColor("red");
       p1.setName("yak");
       p1.setPrice(10);

       Pen p2 = new Pen();
       p2.setColor("red");
       p2.setName("yak");
       p2.setPrice(10);

        Pen p3 = new Pen();
        p3.setColor("red");
        p3.setName("yak");
        p3.setPrice(10);



       System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        Hashtable<Pen, Integer> hashTble = new Hashtable<>();
        hashTble.put(p1, 20);
        hashTble.put(p2, 55);
        Integer p = hashTble.get(p3);

        System.out.println("value : " + p);
        System.out.println("hash: " + Objects.hash(1));
    }


    @Override
    public void show() {

    }

    @Override
    public void print(String text) {
        MyInterface.super.print(text);
        MyInterface.play();
    }



    private static class Pen{
        private String color;
        private String name;
        private int price;

        private void setPrice(int price){
            this.price = price;
        }

        private int getPrice(){
            return price;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Pen pen = (Pen) obj;

            if(this.getPrice() == pen.getPrice()  && this.getColor().equals(pen.getColor()) && this.getName().equals(pen.getName())){
                return  true;
            }

            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(color, name, price);
        }
    }

}
