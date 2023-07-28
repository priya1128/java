package multithreading;

public class PriorityThreadExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread5 obj5 =  new MyThread5();
        Thread th5 = new Thread(obj5);
        MyThread6 obj6 =  new MyThread6();
        Thread th6 = new Thread(obj6);
        //th5.setPriority(10);
        //th6.setPriority(1);
        th5.setPriority(Thread.MIN_PRIORITY);
        th6.setPriority(Thread.MAX_PRIORITY);
        th5.start();
        th6.start();
    }
}

class MyThread5 implements Runnable {

    @Override
    public void run() {
        System.out.println("MyThread5 Started");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread5 Completed");
    }
}

class MyThread6 implements Runnable{

    @Override
    public void run() {
        System.out.println("MyThread6 Started");
        System.out.println("MyThread6 Completed");
    }
}
