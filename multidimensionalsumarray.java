import java.util.*;
import java.io.*;
public class multidimensionalsumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n,c,d;
        System.out.println("Enter number of rows and columns: ");
         m = sc.nextInt();
         n = sc.nextInt();
         int first[][] = new int[m][n];
         int second[][] = new int[m][n];
         int sum[][] = new int[m][n];
         System.out.println("Enter elements of first matrix ");
         for(c = 0;c<m;c++){
            for(d = 0;d<n;d++){
                first[c][d] = sc.nextInt();
            }
         }
         System.out.println("Enter eelements of Second matrix ");
         for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                second[c][d] = sc.nextInt();
            }
         }
         for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                sum[c][d] = first[c][d] + second[c][d];
            }
         }
         System.out.println("Sum of matrix ");
         for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                System.out.print(sum[c][d]+"\t");
               
        }
        System.out.println();
    }
    }
}
