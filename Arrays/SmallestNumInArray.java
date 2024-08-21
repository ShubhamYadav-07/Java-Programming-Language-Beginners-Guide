package Arrays;
import java.util.*;
public class SmallestNumInArray {

    public static int getSmallest(int arr[]){
        int smallest = Integer.MAX_VALUE;    // Initialize +infinity (highest possible integer).
        for(int i=0;i<arr.length;i++){
            if(arr[i] < smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){   // Enter elements in array.
            arr[i]=sc.nextInt();
        }
        System.out.print("The entered array is : ["); //Display array.
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
        System.out.println("The smallest element is : " + getSmallest(arr));    //Call getLargest()
        sc.close();
    }
}