package Epam6.com.CustumCollection;
import java.util.*;
public class App {
    public static void main( String[] args ){
    	Scanner in = new Scanner(System.in);
    	CustomList arr = new CustomList();
    	System.out.println("Initializing custom list with 10 elements");
    	arr.adding(new Integer(1));
    	arr.adding(new Integer(2));
    	arr.adding(new Integer(3));
    	arr.adding(new Integer(4));
    	arr.adding(new Integer(5));
    	arr.adding(new Integer(6));
    	arr.adding(new Integer(7));
    	arr.adding(new Integer(8));
    	arr.adding(new Integer(9));
    	arr.adding(new Integer(10));
        System.out.println("Successfully Initialized");
        System.out.print("All Elements in list after adding ");
        System.out.println(arr);
        System.out.println("Enter how many elements you want to remove");
        int removeelements  = in.nextInt();
        for(int i = 0; i < removeelements; i++) {
                 System.out.println("Enter the index you want to remove");
                 int n = in.nextInt();
                 arr.remove(n);
        }
       System.out.println(" All the elemnets in the list after Removing");
       System.out.println(arr);
       System.out.println("Enter how many elements you want to fetch");
       int fetchelements  = in.nextInt();
       for(int i = 0; i < fetchelements; i++) {
                System.out.println("Enter the elemen you want to fetch");
                int n = in.nextInt();
                 arr.fetching(n);
        }  
   
    System.out.print("All Elements in list after fetching ");
        System.out.println(arr);
    System.out.println("Fectching");
   
      System.out.print("All Elements in list are ");
       System.out.println(arr);
       System.out.println("Number of elements in list are:"+arr.size());
        
    }
}
