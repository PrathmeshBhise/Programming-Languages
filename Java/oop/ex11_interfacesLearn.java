
//Interfaces are just like like abstract class but difference is that it has all its methods abstract
//meaning that all methods of interfaces must be implemented 
//interfaces is collection of realated methods
//also subclass can implement any no of interfaces (Multiple inheritance can be achieved) 
//Diff is that abstract class can be extended(inherited only one time) but interfaces can be implemented many time

interface bicycle{
    void applybreak();
    void speedup();
}
interface horn{
    void hornNormal();
    void hornsong();
}
class Atlas implements bicycle , horn{

    // all the inherited or implemented interface methods must be made public
    @Override
    public void applybreak(){
        System.out.println("Break Applying !");
    }
    @Override
    public void speedup(){
        System.out.println("Speeding Up !");
    }
    @Override
    public void hornNormal(){
        System.out.println("Peeep Peep !");
    };
    @Override
    public void hornsong(){
        System.out.println("Ye Ganpat Chal D1@u LA !");
    };
}




interface mybicycle{
    void applybreak();
    // Private helper methods (Java 9+) — cannot be accessed outside this interface
    // Default methods — concrete and optional to override
    // Abstract methods — must be implemented in implementing classes

    // We can implement private methods inside an interface (Java 9+) 
    // They cannot be accessed or overridden by classes outside this interface

    private void name(){
        System.out.print("Dhanno is--->");
    }
    //when code is too large 
    // default methods can be used to add new behavior to an interface
    // without forcing all implementing classes to provide their own implementation

    default void bname(){
        name();// we can use private method in a class
        System.out.println("My Bicycle name");
    }
    
}
interface backlight{
    default void backlightcolor(){
        System.out.println("Red Light !!");  
    }
}
interface myhorn extends mybicycle , backlight{
    void hornNormal();
    void hornsong();
}

//Remember an interface can inherit other interface but a class can not inherit(extends) an interface 
//it can only implement it
//that's
// class inherited extends myhorn{
// }
//not allowed


class needs implements myhorn{
    @Override
    public void hornNormal(){
        System.out.println("Hehhehe !!");
    }
    @Override
    public void hornsong(){
        System.out.println("HOHOHO !!");
    }
    @Override
    public void applybreak(){
        System.out.println("Not Now !!");
    }
}


public class ex11_interfacesLearn {
    public static void main(String[] args) {
        Atlas a = new Atlas();
        a.applybreak();
        a.speedup();
        a.hornNormal();
        a.hornsong();
        System.out.println("---->>also<<------");
        needs obj = new needs();
        obj.applybreak();
        obj.hornNormal();
        obj.hornsong();
        obj.backlightcolor();

        //Now Polymorphis in Interfaces
        //similar to dyanic method dispatch
        //first we created a reference obj of interface for which we only want to access
        //which forces the obj of class/interface to access only mothods of reference interfce
        mybicycle bc = new needs();
        bc.applybreak();//allowed
        bc.bname();//allower
        // bc.hornNormal();--> not allowed as we used reference of mybicycle so method of 
        //only mybicycle can be accessed even though need class implments both interfaces mybicycle and myhorn
    }
}
