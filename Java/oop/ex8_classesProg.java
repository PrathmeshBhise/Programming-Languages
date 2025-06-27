
import java.util.Scanner;

class employee11{
    public int salary;
    public String name;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getName(){
        System.out.println("--sThe Name of Employee :"+name);
    }
    public void getSalary(){
        System.out.println("--The Salary of Employee is :"+salary);
    }
    //Direct Giving Name to method
    public void setName(String s){
        name=s;
        System.out.println("----The Updated New name of employee :"+name);

    }
    //Asking name input
    public String changeN(){
        try(Scanner sc = new Scanner(System.in) ){
            System.out.print("--Enter the new name of employee :");
            name= sc.nextLine();
            return name;
        }
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

}
class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }

}
class circle1{
    private int radius;
    private final float  pi=3.14f;
    public float set_area(int r){
        radius=r;
        return pi*(radius*radius);
    }
    public float set_perimeter(int r){
        radius=r;
        return 2*(pi*radius);
    }

    
}


public class ex8_classesProg {
    public static void main(String[] args) {
        employee11 obj = new employee11();
        obj.name="Om";
        // obj.salary=007;
        // obj.getName();
        // obj.getSalary();
        // obj.setName("Jake");
        // String c=obj.changeN();
        // System.out.println("--New Name is :"+c);
        
        //Square Class
        Square obj2=new Square();
        obj2.side=12;
        System.out.println("The Area SQ is :"+obj2.area());
        System.out.println("The Perimeter SQ is :"+obj2.perimeter());

        //For Rectangle
        Rectangle ob =new Rectangle();
        ob.length=12;
        ob.breadth=15;
        System.out.println("The Area RC is :"+obj2.area());
        System.out.println("The Perimeter RC is :"+obj2.perimeter());

        //Using circle
        circle1 c = new circle1();
        System.out.println(c.set_area(15));
        System.out.println(c.set_perimeter(15));
        
        


        
        
    }
}
