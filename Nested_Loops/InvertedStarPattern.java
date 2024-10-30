package Nested_Loops;

import java.util.*;

public class InvertedStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many no. of lines : ");
        int line = sc.nextInt();
        for(int i=1;i<=line;i++){
            for(int j=1;j<=(line-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }    
}
