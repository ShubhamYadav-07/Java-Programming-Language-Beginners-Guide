import java.util.*;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime=true;
        if(num==1){
            System.out.println(num+" is neither prime nor composite.");
        }
        else if (num==2){
            System.out.println(num+" is a prime no.");
        }
        else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println(num+" is a prime no.");
            }
            else{
                System.out.println(num+" is not a prime no.");
            }
            sc.close();
        }    
    }
}