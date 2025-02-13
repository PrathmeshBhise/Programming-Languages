import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        //This Block is about taking input from user
        // try(Scanner sc = new Scanner(System.in)){
        //     System.out.println("Enter a String :");
        //     String sTr= sc.nextLine(); //Nextline beacuse we want full string
        //     System.out.println("The String is :"+sTr);
        //     System.out.println("The Length of the String is :"+sTr.length());}

            String str = "JavaProgramming";
            
            System.out.println("To convert the string to lowercase :"+ str.toLowerCase());
            System.out.println("To Convert to Uppercase :" + str.toUpperCase());
            System.out.println("To Search Char at index in String :" + str.charAt(2));
            System.out.println("To Search the index of char :" + str.indexOf('P'));
            System.out.println("To Extract any Substring form a string : "+ str.substring(4));
            
            // Includes Starting that given index
            System.out.println("To get last occurance index of char in string :" + str.lastIndexOf('g'));
            // Includes Starting that given index and Excludes Ending index
            System.out.println("To Extract any Substring form a string : "+ str.substring(4, 8));

            //To chech if string startswiith or Endswith something
            System.out.println(str.startsWith("Java"));
            System.out.println(str.endsWith("Java"));

            //To Compare the String
            System.out.println(str.equals("JavaProgramming"));//Case Sensitive
            System.out.println(str.equalsIgnoreCase("JavaPOGRAMMING"));//Now Case Insensitive
            System.out.println(str.equalsIgnoreCase("javaprograMMing"));//Now Case Insensitive

            //To Replace the string with another string
            System.out.println("Before Replace :"+str);
            System.out.println("After replace : "+ str.replace("Java","Python"));

            //To Remove the spaces from the string we use trim()
            String str1 = "    Java Programming    ";
            System.out.println("Before Trim :"+str1);
            System.out.println("After Trim :"+str1.trim());



        //String Problems
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Your Name :");
            String name= sc.nextLine();
            String str4 = "Dear A ,Thanks a Lot !!";
            System.out.println(str4.replace("A", name));

        }
        String str5="  JavaProgramming   ";
        System.out.println(str5.indexOf("  "));
        System.out.println(str5.indexOf("   "));

        String str6="Autobots,\n \tThis is Optimus Prime,\n \tThanks for your help.";
        System.out.println(str6);


       
    }
}
