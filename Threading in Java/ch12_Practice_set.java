
class th extends Thread{
    @Override
    public void run() {
        int i =0;
        while(i<1000){
            System.out.println("Good Morning !");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class th1 extends Thread{
    @Override
    public void run() {
        int i =0;
        while(i<1000){
            System.out.println("Welcome !");

            i++;
        }
    }
}

public class ch12_Practice_set {
    public static void main(String[] args) {
        th obj = new th();
        th1 obj1 = new th1();
//        obj.start();
//        obj1.start();
//        obj.setPriority(Thread.MAX_PRIORITY);
        System.out.println("The state is "+ obj.getState());
        System.out.println("The state is "+ obj1.getState());
        System.out.println("The Priority of Thread 2 is "+ obj1.getPriority());
        System.out.println("The Priority of Thread 2 with currentThread is "+ Thread.currentThread().getPriority());


    }
}
