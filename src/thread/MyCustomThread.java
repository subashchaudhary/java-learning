package thread;


//creating thread by Extending Thread Class
public class MyCustomThread extends Thread{

    @Override
    public void run() {

        try {

            //simulate that this thread is taking some time to complete its tasks.
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread Started! :" + Thread.currentThread().getName());

    }
}
