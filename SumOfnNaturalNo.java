import java.util.*;
public class SumOfnNaturalNo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of "+ n + " natural no. is : " + sum);
        sc.close();
    }
}
