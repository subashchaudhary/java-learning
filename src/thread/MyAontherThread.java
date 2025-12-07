package thread;

public class MyAontherThread extends Thread{

    @Override
    public void run() {
        System.out.println("Thread Strated: " + Thread.currentThread().getName());
    }
}
