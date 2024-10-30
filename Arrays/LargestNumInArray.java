package Arrays;
import java.util.*;
public class LargestNumInArray {

    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;    // Initialize -infinity (lowest possible integer).
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest=arr[i];
            }
        }
        return largest;
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
        System.out.println("The largest element is : " + getLargest(arr));    //Call getLargest()
        sc.close();
    }
}
