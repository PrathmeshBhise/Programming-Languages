

class methodsJava{

    // //Method Creation
    // static void method(){
    //     System.out.println("Hello Java World !!");
    // }
    // static int add(int x,int y){
    //     return x+y;
    // }
    
    // //Here Check Both the methods have same name but different parameters this is concept of method overloading
    // int sum(int x,int y){
    //     return x+y;
    // }
    
    // //Using Variable Arguments Meaning flexible number of arguments
    // static int sum(int...arr){
    //     int result=0;
    //     for (int a:arr){
    //         result+=a;
    //     }
    //     return result;
    // }

    // //Fibonacci Series
    // static void Fibonacci(int n){
    //     int a=0;
    //     int b=1;
    //     for(int i=0 ; i<n ; i++){
    //         System.out.println(a);
    //         int temp = a+b;
    //         a=b;
    //         b=temp;
    //     }
    // }

    // //To Find Multiplication of table of a number
    // static void table(int n){
    //     for (int i =1 ; i<=10 ; i++){
    //         System.out.println(n +" X "+i +" = " + n*i);
    //     }
    // }
    
    // //To print star Pattern 
    // static void star(int n){
    //     for ( int i=1 ; i<=n ; i++){
    //         for(int j=1 ; j<=i ; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     } 
    // }
    // // //REVERSE STAR PATTERN
    // static void starR(int n){
    //     for ( int i=n ; i>=1 ; i--){
    //         for(int j=1 ; j<=i ; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     } 
    // }

    // //Sum of n Natural Numbers
    // static int  sumRec(int n){
    //     if (n==1){
    //         return n;
    //     }
    //     else{
    //         return n+ sumRec(n-1);
    //     }
    // }

    // //Finding the n term of Fibonacci Using Recursion
    // static int fib(int n){
    //     if(n==1 || n==2){
    //         return n-1;
    //     }
    //     else {
    //         return fib(n-1)+ fib(n-2);
    //     }
    // }

    // //Finding the average of Set of numbers passed as arguments
    // static int avgNum(int ...arr){
    //     int sum=0;
    //     for(int e:arr){
    //         sum+=e;
    //     }
    //     return sum/arr.length;
    // }

    // //To print star pattern using Recursion
    // //If 3 is passed first 
    // //startRec(3)=startRec(2) + prints *** +new line
    // //startRec(2)=startRec(1) + prints **  +new line
    // //startRec(1)=startRec(0) + prints *   +new line
    // static void starRec(int n){
    //     if(n>0){
    //         starRec(n-1);
    //         for(int i=1 ; i<=n ; i++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    // //for reverse using recursion
    // static void starRecRev(int n){
    //     if(n>0){
    //         for(int i=1 ; i<=n ; i++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //         starRecRev(n-1);
    //     }
    // }

    // //Sum of Natural no using iterative approach
    // static int sum(int n){
    //     int sum1 =0;
    //     for (int i=1 ; i<=n ; i++){
    //         sum1+=i;
    //     }
    //     return sum1;
    // }

    //Celsius to Fahrenheit:
    static int tempe(int n){
        return (n*9/5)+32;
    }


    public static void main(String[] args) {
        // //Method Calling with void(No Return type) & static(belongs to class & no need to create object)
        // method();

        // //Method with return type & static(belongs to class & no need to create object)
        // int c=add(2,3);
        // System.out.println("The sum of the two numbers is : "+ c);

        // //Method with return type & non-static(belongs to object & need to create object)
        // methodsJava obj = new methodsJava();
        // int res = obj.sum(5,4);
        // System.out.println("The sum of the two numbers is : "+ res);

        // //Method with variable arguments
        // System.out.println("The Sum Calculating method for any no. of ints is :" + sum(2,3,4,5,6));

        // //Fibonacci Series method calling
        // Fibonacci(10);

        // //Table of a number method calling
        // table(5);

        // // //Star Pattern method calling
        // star(5);

        // // //Reverse Star Pattern method calling
        // starR(5);

        // //To Call SumRec method
        // System.out.println("The Sum of N natural Numbers is :" + sumRec(4)); 

        // //Calling Recursive fib to find nth term
        // System.out.println("The n'th (let it 4)term of fib series is : "+ fib(4));

        // //Calling the average fun for any arbitrary numbers
        // System.out.println("The average of (let it 12,11,23,11) :"+avgNum(10,20,30,50,60,70));

        // // Star Pattern Using Recursion 
        // System.out.println("Star Pattern using Recursion :");
        // starRec(3);
        // starRecRev(3);

        //Sum of Natural no using iterative approach
        // System.out.println("The sum using iterative approsch :");
        // System.out.println(sum(4));

        //Celsius to Fahrenheit:
        System.out.println("Celsius to Fahrenheit:");
        System.out.println(tempe(35));

    }
}