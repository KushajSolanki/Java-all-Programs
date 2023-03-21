import java.util.*;
import java.io.*;
public class ar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] age = {18,19,17,20,18};
        System.out.println("Fourth element in array is "+age[3]);
        int sum = 0;
        for(int i=0;i<age.length;i++)
        {
            if(age[i]%2==0){
            sum = sum + age[i];
            }
        }
        System.out.println("Sum is "+sum);
    }
}
