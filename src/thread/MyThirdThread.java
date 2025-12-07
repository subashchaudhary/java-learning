package thread;

public class MyThirdThread implements Runnable{
    @Override
    public void run() {

        System.out.println("Executing Task by :" + Thread.currentThread().getName());

    }
}
