import java.util.Scanner;
class Calculator 
{
    void add(int a, int b){
        System.out.println("Addition is "+(a+b));
    }
    void avg(int a, int b, int c){
        System.out.println("Average is "+((a+b+c)/3));
    }
}
public class FunctionOverloading{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c1 = new Calculator();
        int a,b,c;
        System.out.println("Enter 3 numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        c1.avg(a, b, c);
    }
}