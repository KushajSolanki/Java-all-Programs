import java.util.Scanner;
public class palindrome {
    public static void checkPal(int n) {
        int r,sum=0,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {System.out.println("Palindrome number");}
        else{
            System.out.println("not Palindrome");}
    }    

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            checkPal(a);
        }
    }

