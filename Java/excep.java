public class excep {
    public static void main(String[] args) {

        /*
without exception handling
        int a = 10000;
        int b = 0;
        int c =a/b;
        System.out.println("The Division is " + c);
        with exception handling
*/
        try{
            int a = 10000;
            int b = 0;
            int c =a/b;
            System.out.println("The Division is " + c);
        }
        catch (Exception e){
            System.out.println("We got problem !!");
            System.out.println("The Exception we got is " + e);

        }
    }
}
