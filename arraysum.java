import java.util.*;
import java.io.*;
public class arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements ");
        int n = sc.nextInt();
        int sum=0;
        int [] ar = new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Array is ");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+",");
            sum+= ar[i];
        }
        System.out.println("\nSum is "+sum);
    }
}
