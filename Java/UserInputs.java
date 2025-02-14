import java.util.Scanner;
public class UserInputs{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number :");
            int num=sc.nextInt();//for integer input
            System.out.println("The number is "+num);

            System.out.println("Enter the string :");
            String str=sc.next();  //for String input it would just give an word but not a sentence 
            System.out.println("The string is:" + str);

            sc.nextLine(); //to clear the buffer 
            //here if you use an sentence string only take the fisrt word and remaining words are in buffer

            System.out.println("Enter the sentence :");
            String sentence=sc.nextLine(); //for sentence input
            System.out.println("The sentence is :"+sentence);

            System.out.println("Enter the float value :");
            float f=sc.nextFloat(); //for float input
            System.out.println("The float value is :"+f); 
            
            sc.close();
        }
    }
}