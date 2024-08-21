package Arrays;
import java.util.*;
public class LinearSearch {
    public static int LinearSearchAlgo(int numbers[],int key){
        int result=-1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                result = i;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("The given array is: ");
        System.out.print("[");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("Enter the key to be searched : ");
        int key = sc.nextInt();
        int index = LinearSearchAlgo(numbers,key);
        if(index == -1){
            System.out.println("The key is not found");
        }
        else{
            System.out.println("The key is present at index "+ index);
        }
        sc.close();
    }
}
