package Nested_Loops;

import java.util.*;
public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many no. of lines : ");
        int line = sc.nextInt();
        char ch = 'A';
        for(int i=1;i<=line;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
