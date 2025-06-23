//Problem 1&2
abstract class pen{
    abstract public void write();
    abstract public void refill();
}
class fountainPen extends pen{
    void changenib(){
        System.out.println("Changing nib..");
    }
    @Override
    public void write(){
        System.out.println("Writing..");
    }
    @Override
    public void refill(){
        System.out.println("refilling..");
    }
    
}

//Problem 3
class Monkey{
    void jump(){
        System.out.println("Jumping..");
    }
    void bite(){
        System.out.println("Biteing..");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Humans need to Eat...");
    }
    @Override
    public void sleep(){
        System.out.println("Humans need to Sleep...");
    }
}

public class ex11 {
    public static void main(String[] args) {
        fountainPen obj = new fountainPen();
        obj.write();
        obj.refill();
        obj.changenib();

        System.out.println("--------------------%%--------------------");
        human h = new human();
        h.eat();
        h.sleep();
        h.bite();
        h.jump();
        System.out.println("-----Polymorphism------");
        Monkey m = new human();
        // m.eat();---> Not allowed
        //m.sleep();--->not allwed
        m.jump();//Allowed
        m.bite();//Allowed
    }
}
