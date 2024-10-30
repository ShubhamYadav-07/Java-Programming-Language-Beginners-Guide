package Arrays;
import java.util.*;
public class ReverseAnArray {

    public static void CreateArray(int arr[],int n){            //Function to create array of size n.
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Enter the element: ");
            arr[i]=sc.nextInt();
        }
        sc.close();
        DisplayArray(arr);                                    //Display function call.
    }

    public static void DisplayArray(int arr[]){                //Function to display created array.
        System.out.print("Created Array : [");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
            System.out.print(arr[i]+ ", ");
            }
        }
        System.out.println("]");
    }

    public static void ReverseArray(int arr[]){              //Function to reverse an array.
        int first = 0,last = arr.length-1;
        while(first<last){
            int temp = arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }
        DisplayArray(arr);                              //Display function call again.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        CreateArray(arr,n);                                  //Create Array function call.
        ReverseArray(arr);                                   //Reverse Array function call.
        sc.close();
    }
}
