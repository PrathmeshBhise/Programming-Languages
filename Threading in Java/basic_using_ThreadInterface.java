class thread1 implements Runnable{
    @Override
    public void run() {
        int i =0;
        while(i<4000){
            System.out.println("Thread 1111");
            i++;
        }
    }
}
class thread2 implements Runnable{
    @Override
    public void run() {
        int i =0;
        while(i<4000){
            System.out.println("Thread 1111");
            i++;
        }
    }
}


public class basic_using_ThreadInterface {
    public static void main(String[] args) {
        System.out.println("Hello");
        thread1 obj1 = new thread1();
        // Here specify with operations on each thread by creating its obj
        Thread t1 =  new Thread(obj1);

        thread2 obj2 = new thread2();

        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
