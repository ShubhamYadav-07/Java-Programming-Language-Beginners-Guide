import java.util.*;
public class FuncToCalcSumofTwoNum {
    public static int CalcSum(int num1, int num2){
        int sum1=num1+num2;
        return sum1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = sc.nextInt();
        System.out.print("Enter second number :");
        int b = sc.nextInt();
        int output = CalcSum(a, b);
        System.out.println("The sum of two numbers is : " + output);
        sc.close();

    }
}
