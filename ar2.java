import java.util.*;
import java.io.*;
public class ar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        double total=0, avg=0;
        double [] m = new double[n];
        for (int i=0;i<n;i++){
            m[i]=sc.nextDouble();
            total=total+m[i];
            avg = total/n;
        }
        System.out.println("Total of array is "+total);
        System.out.println("Average of array is "+avg);
    }
}