package Arrays;
import java.util.*;
public class CreatingArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[]=new int[10];
        //Creating an array
        marks[0]=sc.nextInt();   // phy
        marks[1]=sc.nextInt();   // chem
        marks[2]=sc.nextInt();   // maths
        //Length of Array
        System.out.println("Length = " + marks.length);
        //Display of Array
        System.out.println("phy = " + marks[0]);
        System.out.println("chem = " + marks[1]);
        System.out.println("maths = " + marks[2]);
        //Updating an Array
        marks[2]=marks[2]+1;
        System.out.println("Updated maths = " + marks[2]);

    }
}
