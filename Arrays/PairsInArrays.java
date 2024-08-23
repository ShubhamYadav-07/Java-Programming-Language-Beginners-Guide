package Arrays;
import java.util.*;
public class PairsInArrays {

    public static void PairArray(int arr[]){                             //Pair Array function definition
        int total_pair=0;
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + current + "," + arr[j] + ")");
                total_pair++;
            }
            System.out.println();
        }
        System.out.println("the total pairs are : " + total_pair);           //total pair counter.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        ReverseAnArray.CreateArray(arr, n);                                  //Create Array function call.
        PairArray(arr);
        sc.close();
    }
}