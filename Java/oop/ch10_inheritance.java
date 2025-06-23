class Animal{
    public String color;
    public String breed;
    public Animal(){
       System.out.println("Base Class Constructor");
    }

    //Overloadding Constructor
    public Animal(String c){
        System.out.println("BAse Class Const. with Para of Color:"+c);
    }

    public void name(String a){
        System.out.println("Name of Animal is :"+a);
    }
}

//Inheritance Animal (Super/Base/Parent Class) and Dog (Sub/Derived/Child Class)
class Dog extends Animal {
    public int size;
    Dog(){
        //This Super keyword is used to access the constr. of base class which have arguments
        //If Super word not here it'll Call default Constructor 
        System.out.println("Derived Class Constructor");
        super.name("Animal");//Calling method of parent class using super
    }

    Dog(int a){
        super("Gray");//it'll Call parameterized Constructor
        //(this) keyword is IMP as it refers to to current object or instance of class 
        //meaning that when we initialize object or instance it will refer to it 
        //Also helps when instance variable and passed parameters are same thats this.a=a; will not give problem
        this.size=a;
        System.out.println("Derived Class Const. with Para of Size:"+size);
    }

    public void sound(){
        System.out.println("The Dog Barks Bhauuu... !!");
    }
    
    @Override//Method Overriding
    public void name(String a){
        System.out.println("Name of Animal is :"+a);
    }

}

public class ch10_inheritance {
    public static void main(String[] args) {
        //Constuctor of both called if derived class constructor is called using its object 
        //But its only base class Costructor of base class is called  when  using base call object
        Dog obj =new Dog();
        System.out.println("");

        Dog ab =new Dog(12);
        System.out.println("");

        obj.sound();//Calling Derived Class method using its own Object
        ab.sound();//Calling Derived Class method using its own Object

        obj.name("Sheru");//Calling Base Class method using derived class Object
    }
}
