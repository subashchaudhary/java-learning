package java8;

import java.time.LocalDateTime;
import java.util.Date;

public class DateTimeDemo {

   // private static String abc;
    static void main(){

        showDate();
    }

    //non-static method
    public void print(){
        showDate();
    }

    public static void showDate(){

        Date date = new Date();
        System.out.println(date);

        System.out.println("using LocalDateTime");
        LocalDateTime dateTime = LocalDateTime.now();
        int day = dateTime.getDayOfMonth();
        System.out.println(dateTime);
        System.out.println("Today date is : " + day);

        // yyyy-MM-dd-HH-mm-ss.zzz


    }

}
