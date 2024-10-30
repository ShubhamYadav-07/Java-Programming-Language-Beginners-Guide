package Arrays;
import java.util.*;
public class UpdateArrayFunction {
    public static void Update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[10];
        System.out.println("Enter 10 elements : ");
        for(int i=0;i<10;i++){
            marks[i]=sc.nextInt();
        }
        Update(marks);
        //display updated array
        for(int i =0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
