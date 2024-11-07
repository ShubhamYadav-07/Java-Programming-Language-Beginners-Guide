package Arrays;
public class createSubArray {
    public static void printSubArrays(int numbers[]){
        int total_subarray=0;
        for(int i=0;i<numbers.length;i++){      //outer loop to calculate start
            int start=i;
            for(int j=i;j<numbers.length;j++){      //inner loop to calculate end
                int end=j;
                for(int k=start;k<=end;k++){            //inner loop to print all elements b/w start & end.
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
                total_subarray++;
            }
            System.out.println();
        }
        System.out.println("The total no. of subarrays: "+total_subarray);      //formula: n(n+1)/2
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubArrays(numbers);
    }
}
