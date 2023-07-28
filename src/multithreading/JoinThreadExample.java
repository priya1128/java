package multithreading;

public class JoinThreadExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 obj3 =  new MyThread3();
        Thread th3 = new Thread(obj3);
        MyThread4 obj4 =  new MyThread4();
        Thread th4 = new Thread(obj4);
        th3.start();
        th3.join();
        th4.start();
        th4.join();
    }
}

class MyThread3 implements Runnable {

    @Override
    public void run() {
        System.out.println("MyThread3 Started");
        try {
            //Thread.currentThread().interrupt();
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread3 Completed");
    }
}

class MyThread4 implements Runnable{

    @Override
    public void run() {
        System.out.println("MyThread4 Started");
        System.out.println("MyThread4 Completed");
    }
}

/*
If Thread join is used. Below output will be received,
    MyThread3 Started
    MyThread3 Completed
    MyThread4 Started
    MyThread4 Completed
else
    MyThread3 Started
    MyThread4 Started
    MyThread4 Completed
    MyThread3 Completed
 */