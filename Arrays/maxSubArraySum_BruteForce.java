package Arrays;
public class maxSubArraySum_BruteForce {        //Basic Code i.e Worst Time Complexity = O(n^3)
    public static void maxSubArraySum(int numbers[]){
        int maxSum=Integer.MIN_VALUE;       //assigned -infinity
        int currSum=0;                              //current sum of every sub-array
        for(int i=0;i<numbers.length;i++){              //start
            int start=i;
            for(int j=i;j<numbers.length;j++){              //end
                int end=j;
                currSum=0;                                  //initialize currSum=0 for every sub array sum calculation.
                for(int k=start;k<=end;k++){                //main calculation print loop
                    System.out.print(numbers[k]+" ");
                    currSum+=numbers[k];
                }
                System.out.println("currsum is: "+currSum);
                if(maxSum<currSum){                 //compare and update maxSum
                    maxSum=currSum;
                }
            }
            System.out.println();
        }
        System.out.println("The max Subarray sum is: "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        maxSubArraySum(numbers);
    }
}
