class Empy{
    private final String name;
    private final int salary;

    //Constructor
    public Empy(){
        name ="Jack";
        salary=1500;
    }
    //method Overloading uisng constructor
    public Empy(String n,int s){
        name =n;
        salary=s;
    }
    public String setname(){
        return name;
    }
    public int setsalary(){
        return salary;
    }
}


public class ch9_constructor {
    public static void main(String[] args) {

        Empy ob = new Empy();//Calling The constructor for default case
        System.out.println("Employee Info :" );
        System.out.print("NAme :"+ob.setname());
        System.out.println("  &  Salary :"+ob.setsalary());

        Empy ob1 = new Empy("jack",15000);
        System.out.println("Name :"+ob1.setname()+" & "+"Salary :"+ob1.setsalary());
        
    }
    
}
