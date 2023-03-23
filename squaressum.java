 import java.util.Scanner;
public class squaressum
{
    public static long sum(int n)
    {
        // base case 1^1 = 1
        if (n == 1)
            return 1;
        else
            // Recursive call
             return ((long)Math.pow(n, n) + sum(n - 1));
    }

    public static void main(String args[])
    {
        Scanner ob1=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=ob1.nextInt();
        System.out.println(sum(a));
    }
} 
    

