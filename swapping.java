import java.util.*;
public class swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,temp;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("1st number is "+a);
        System.out.println("2nd number is "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("1st number is "+a);
        System.out.println("2nd number is "+b);
    }
}
