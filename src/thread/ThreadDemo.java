package thread;

public class ThreadDemo {

    //steps to create a Thread.
    /**
     *
     * 1. Create a sub-class of Thread by extends keyword
     *
     * 2. override the run() method to give the code which will be executed by Thread
     *
     * 3. Create an object of your Thread class
     *
     * 4. call the Thread.start() method.
     */

    static void main(){

        System.out.println("Application started ...");

        //thread object creation
        MyCustomThread thread1 = new MyCustomThread();
        MyAontherThread thread2 = new MyAontherThread();

        //Runnable class
        MyThirdThread runnableClass = new MyThirdThread();
        Thread thread3 = new Thread(runnableClass);

        //starting thread
        thread1.start();
        thread2.start();
        thread3.start();


        try {

            //Join it waits for the thread to complete its tasks
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Application Stopped");
    }

}

/**
 * Print odd and even numbers from 1 to 100  or (you can also take input for the range)
 *
 * using thread , thread 1 to print odd number and thread 2 to print event number.
 */



