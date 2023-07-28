package multithreading;

public class NonSynchronizationExample{
    public static void main(String[] args){
        PrintOddNumber obj = new PrintOddNumber();
        //Here Thread is anonymous class
        Thread th7 = new Thread(){
            public void run(){
                obj.print(100,130);
            }
        };
        Thread th8 = new Thread(){
            public void run(){
                obj.print(250,280);
            }
        };
        th7.start();
        th8.start();
    }
}

class PrintOddNumber{
    public synchronized void print(int startRange, int endRange){
        for(int i=startRange;i<endRange;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}