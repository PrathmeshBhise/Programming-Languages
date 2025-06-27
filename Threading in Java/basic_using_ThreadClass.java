class thread11 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<4000){
            System.out.println("Thread 1 Running------------------");
            i++;
        }
    }
}
class thread22 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<4000){
            System.out.println("Thread 2 Running");
            i++;
        }
    }
}
class thread33 extends Thread{
    @Override
    public void run() {
        // int i=0;
        while(true){
            System.out.println("Thread 3 Running");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class thread44 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<4000){
            System.out.println("Thread 4 Running");
            i++;
        }
    }
}


public class basic_using_ThreadClass {
    public static void main(String [] args){
        System.out.println("Hello");
        thread11 obj1 = new thread11();
        thread22 obj2= new thread22();
        thread33 obj3= new thread33();
        thread44 obj4= new thread44();


        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj3.setPriority(Thread.NORM_PRIORITY);
        obj4.setPriority(Thread.MIN_PRIORITY);

        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
    }
}
