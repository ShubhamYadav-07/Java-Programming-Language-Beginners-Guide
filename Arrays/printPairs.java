package Arrays;

import java.util.*;
public class printPairs {
    public static void print_Pairs(int numbers[]){
        //outer loop
        for(int i=0;i<numbers.length;i++){
            int current = numbers[i];
            //inner loop
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+current+","+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element: ");
            numbers[i]=sc.nextInt();
        }
        print_Pairs(numbers);
        sc.close();
    }
}
