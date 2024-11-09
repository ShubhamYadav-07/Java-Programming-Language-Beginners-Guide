package Arrays;
public class maxSubArraySum_PrefixSum {
    public static void maxSubArraySum(int numbers[]){
         int currSum=0;
         int maxSum=Integer.MIN_VALUE;

         //Create a prefix array of same length as of numbers array.
         int prefix[]=new int[numbers.length];

         //calculate prefix sum
         prefix[0]=numbers[0];
         for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];       //prefix sum logic//
         }

         for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;

                currSum = (start==0) ? prefix[end]:prefix[end]-prefix[start-1];     //currSum calculation logic
            }
            if(maxSum<currSum){                                 //Time Complexity: O(n^2) as only two loops used as 
                maxSum=currSum;                                                //compared to BruteForce method.
            }
         }
         System.out.println("The maxSubArray Sum is: "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxSubArraySum(numbers);
    }
}
