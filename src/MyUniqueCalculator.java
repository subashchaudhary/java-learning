import java.util.List;
import java.util.Scanner;

public class MyUniqueCalculator {


    static void main() {


        Scanner scanner = new Scanner(System.in);

        String n = "5";

       int parsedInt =  Integer.parseInt(n);
        //addition
        int choice;
        //add
        choice = 1;

        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;




        String result = num1 + " + " + num2 + " = "+ sum;

        String []history= new String[10];
        history[0] = result;

        System.out.println(result);


        choice = 5;

        for(int i = 0; i < history.length; i++){
            System.out.println(history[i]);
        }
    }




}
