import java.util.*;
public class BinomialCoefficient {
    public static int factorial(int n){
        int prod=1;
        for(int i=1;i<=n;i++){
            prod*=i;
        }
        return prod;
    }

    public static float Bin_Coeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_minus_r_fact = factorial(n-r);
        float Bin_Coeff = n_fact/(r_fact * n_minus_r_fact);
        return Bin_Coeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();
        System.out.println("The binomial coefficient of " + n + " and " + r + " is : " + Bin_Coeff(n, r));
        sc.close();
    }
}
