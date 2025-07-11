//ArrayList is an Resizable Array to solve the problems like
/* 1. Predefined size
2.Adding Element at a position without removing that position element
 

 */
import java.util.ArrayList;

public class arrayListLearn {
    public static void main(String[] args) {
        ArrayList <Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(130);
        l1.add(140);
        l1.add(150);
        l1.add(50);
        l1.add(40);

        //Printing ArrayList
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + ", ");
        }

        //Finding Element
        System.out.println();
        System.out.println(l1.contains(30));

        //Finding Elements By Index
        //1. First Occurance of Particluar Element
        System.out.println(l1.indexOf(50));
        //2.Last Occurance of Particluar Element
        System.out.println(l1.lastIndexOf(50));

        //To Replace an Element with other removing that element
        l1.set(2, 100);

        //We can Also Add two arrays by adding elements Starting from particular index or at last
        ArrayList <Integer> l2= new ArrayList<>();
        l2.add(200);
        l2.add(210);

        l1.addAll(l2);
         for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + ", ");
        }

        System.out.println();
        System.out.println();
        
        ArrayList <Integer> l3= new ArrayList<>();
        l3.add(200);
        l3.add(210);

        l1.addAll(0,l3);
         for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + ", ");
        }






        
    }
}
