public class Arrays {
    public static void main(String args []){
        //There are three ways to create an array in Java along with diff data types
        //1-> Declaration and memory allocation
        // int [] marks1;            //Declaration of a reference variable of integer array
        // marks = new int[5];     //Memory allocated for 5 integers
        // marks1[0] = 1;
        // marks1[1] = 11;
        // marks1[2] = 12;
        // marks1[3] = 13;
        // marks1[4] = 14;

        // //2-> Declaration along with memory allocation
        // float [] marks2 = new float[5];  
        // marks2[0] = 1;
        // marks2[1] = 11;
        // marks2[2] = 12;
        // marks2[3] = 13;
        // marks2[4] = 14;
        // System.out.println(marks2[0]);

        //3-> Declaration, memory allocation and initialization
        // String [] marks = {"aa","bb","cc", "dd", "ee"};
        // System.out.println("Accesing The elements with index :"+ marks[0]);
        // System.out.println("The length of the array is : "+ marks.length);

        // //printing the array using for loop
        // for (int i=0 ; i < marks.length ; i++){
        //     System.out.println(marks[i]);
        // }
        // //printing in reverse order
        // for (int i=marks.length-1 ; i >=0 ; i--){
        //     System.out.println(marks[i]);
        // }

        // //more Simple way
        // for (String element: marks){
        //     System.out.println(element);
        // }


        //2D array
        int [][] flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for ( int i =0 ; i<flats.length ; i++){
            for ( int j =0 ; j<flats[i].length ; j++){
                System.out.print(flats[i][j]);
                System.out.print("  ");
            }
            System.out.println(" ");
        }



    }
    
}
