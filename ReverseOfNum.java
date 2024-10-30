import java.util.*;
public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit;
        int rev=0;
        int temp=num;
        sc.close();
        while(temp>0){
            digit = temp % 10;
            temp /=10;
            rev=((rev*10)+digit);
        }
        System.out.println("The reverse of " + num + " is : " + rev);
    }
}
