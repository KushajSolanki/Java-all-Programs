import java.util.*;
import java.io.*;
public class arrayloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = {10,20,30,40,50};
        for (int x : numbers )
        {
            System.out.println(x);
        }
        String [] names = {"Kushaj", "lucky", "Pavan"};
        for (String y : names )
        {
            System.out.println(y);
        }
        System.out.println("Enter number of elements ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
    }    
}
