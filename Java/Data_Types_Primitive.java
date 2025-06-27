class Data_Types_Primitive{
    public static void main(String[] args){
        int num=123456789;
        long num_long=12888999999L;
        System.out.println(num);
        System.out.println(num_long);
        

        float decimal_num=123.789f;
        double decimal_double=123.22;
        System.out.println(decimal_num);
        System.out.println(decimal_double);
        
        boolean boolean_value=true;
        char ch= 'S';
        byte byte_value= -128;
        String str="aaj tak tv";
        System.out.println(" "+  ch +"   "+ byte_value +"  " + str + "  "+ boolean_value);
        
        //Type Casting 1.Implicit(meaning that the compiler will handle it)
        //2.Explicit(meaning that you need to handle it)
        int n1= (int)num_long;  //Explicit Casting (long → int)(Narrowing)(Data loss)
        double n2= num;    //Implicit Casting (int → double)(Widening)(No Data loss)
        System.out.println(n1);
        System.out.println(n2);
        System.out.println("The Data type Operations are learned");
    }
}