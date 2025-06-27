

class threads1 extends Thread{
    public threads1(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Run Thread 1 !!");
    }
}

class threads2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread 2 is running !");
    }
}
class threads12 extends Thread{


    @Override
    public void run() {
        int i =0;
        while(i<2000){
            System.out.println("Operational Run Thread 1 !!");
            i++;
        }
    }
}
class threads13 extends Thread{


    @Override
    public void run() {
        int i =0;
        while(i<2000){
            System.out.println("Operational Run Thread 2222222222 !!");
            i++;
        }
    }
}



public class constructors {
    public static void main(String[] args) {
        System.out.println("Hello !");
        threads1 t1 = new threads1("Pratham");
        t1.start();
        System.out.println("The Id of Thread 1 is " + t1.threadId());
        System.out.println("The Name of the Thread 1 is "+ t1.getName());

        threads2 obj = new threads2();
        Thread d1 = new Thread(obj, "Bhise");
        d1.start();
        System.out.println("The Id of Thread 2 is " + d1.threadId());
        System.out.println("The Name of the Thread 2 is "+ d1.getName());

        threads12 t3 = new threads12();
        threads13 t4 = new threads13();

        t3.start();

        try{
            t3.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t4.start();




    }
}
