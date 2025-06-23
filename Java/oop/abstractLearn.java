//Abstract class can not be instantiated but can be inherited by other classes , like here
//circle extends shape
abstract class shape{
    abstract public void name();
}

//the class which extends abstarct class must have its all abstarct methods in it

class circle extends shape{
    @Override
    public void name(){
        System.out.println("Shape Name is circle !");
        square s = new square();
        s.name();
        s.greet();
    }
}
class square extends shape{
    @Override
    public void name(){
        System.out.println("Shape Name is square !");
    }
    public void greet(){
        System.out.println("Hello I'm Square !");
    }
}
//Also if you dont define abstract methods of abstarct class in subclass 
//it must needed to be converted into abstract class using abstract keyword




public class abstractLearn {
    public static void main(String[] args) {
        circle c = new circle();
        c.name();
    }
}

