public class problemsOnArray {
    public static void main(String[] args) {
        // //Array of 5 float and their sum
        // float [] marks ={ 15.12f,2,3.12f,4,5.14f};
        // float sum=0;
        // for (int i=0 ; i<marks.length ; i++){
        //     sum+=marks[i];
        // }
        // System.out.println("The sum of the array is : "+ sum);

        // //To find Given Int in an array
        // int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        // int toFind = 7;
        // for (int i=0 ; i<numbers.length ; i++){
        //     if (toFind == numbers[i]){
        //         System.out.println("The number is found at index : "+ i);
        //         break;
        //     }      
        // }


        // //To calculate average of an array
        // int[] score={10,20,30,40,50};
        // int sum1=0;
        // for( int element:score){
        //     sum1+=element;
        // }
        // System.out.println("The Average Score if :" + sum1/score.length);

        //Addition of 2 Matrices Using 2d arrays
        // int [][] mat1={{1,2,3},{4,5,6}};
        // int [][] mat2={{3,2,1},{6,5,4}};
        // int [][] result ={{0,0,0},{0,0,0}};
        // for (int i=0 ; i<mat1.length ; i++){
        //     for(int j=0 ; j<mat1[i].length ; j++){
        //         result[i][j]= mat1[i][j]+ mat2[i][j];
        //     }
        // }
        // System.out.println("The sum of the two matrices is : ");
        // for (int i=0 ; i<mat1.length ; i++){
        //     for(int j=0 ; j<mat1[i].length ; j++){
        //         System.out.print(result[i][j]);
        //         System.out.print(" ");
        //     }
        // System.out.println("  ");
        // }

        // //To find the largest element in an array
        // int[] bigest={10,20,30,40,-50};
        // int max = Integer.MIN_VALUE; //It will give the minimum value of integer
        // for( int element : bigest){
        //     if (element >max){
        //         max=element;
        //     }
        // }
        // System.out.println("The Maximum Element is : "+ max);
        // // //To find the smallest element in an array
        // int min = Integer.MAX_VALUE;
        // for( int element : bigest){
        //     if (element < min){
        //         min=element;
        //     }
        // }
        // System.out.println("The Minimum Element is : "+ min);


        //To Reverse an array
        // int [] arr={1,2,3,4,5};
        // int l= arr.length;
        // int a = Math.floorDiv(arr.length, 2);
        // for( int i=0 ; i<a ; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[l-1-i];
        //     arr[l-1-i] = temp;
        // }
        // System.out.println("The reversed array is : ");
        // for (int element : arr){
        //     System.out.print(element +" ");
        // }
        
        //To Check Wether array is sorted or not
        int [] arr={10,2,3,4,5};
        boolean isSorted = true;
        for (int i=0 ; i<arr.length-1 ; i++){
            if (arr[i]>arr[i+1]){
                isSorted= false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }






    }

}
