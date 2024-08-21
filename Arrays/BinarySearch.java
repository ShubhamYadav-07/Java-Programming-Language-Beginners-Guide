package Arrays;
import java.util.*;
public class BinarySearch {
    public static int BinarySearchAlgo(int arr[],int key){
        int start=0, end=arr.length-1;     // Initialize start and end point of array.
        while(start<=end){
            int mid=(start+end)/2;         //Initialize mid inside the loop for updaton.
            if(arr[mid]==key){    //Key found.
                return mid;
            }
            if(arr[mid]>key){     // Left half of array.
                end=mid-1;
            }else{               // Right half of array.
                start=mid+1;
            }
        }
        return -1;   //Key not found.
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("!!! Enter elements in sorted order !!!");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key to be searched : ");
        int key = sc.nextInt();
        System.out.println("The key is at index : " + BinarySearchAlgo(arr, key));  //Function call.
        sc.close();
    }
    
}
