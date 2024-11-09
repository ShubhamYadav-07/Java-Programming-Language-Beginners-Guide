package Arrays;

public class Kadanes_Algorithm_SubArray_MaxSum {
    public static void kadanes_Algorithm(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        boolean allnegative=false;              //check if all elements in array is -ve ?
        for(int i=0;i<numbers.length;i++){      //Time Complexity = O(n)

            //currSum calculation
            currSum+=numbers[i]; 

            //check if currSum is -ve then update currSum=0; Since zero is better than any -ve value.
            if(currSum<0){
                currSum=0;
            }

            //compare the maximum value b/w currSum and maxSum in each step.
            maxSum=Math.max(currSum,maxSum);
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0){
                allnegative=true;
            }
        }
        if(allnegative==true){          //if all -ve true then display the least maximum value.
            int max=Integer.MIN_VALUE;
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]>max){
                    max=numbers[i];
                }
            }
            maxSum=max;
        }
        System.out.println("The max SubArray sum is: " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,-4,-1,-2,-1,-5,-3};
        kadanes_Algorithm(numbers);
    }
}
