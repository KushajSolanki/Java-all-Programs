import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1:ADDITION");
        System.out.println("2:SUBTRACTION");
        System.out.println("3:MULTIPLICATION");
        System.out.println("4:DIVISION");
        int button = sc.nextInt();
        operations op=new operations();
        switch(button){
            case 1 : op.addition();
            break;
            case 2 : op.subtraction();
            break;
            case 3 : op.multiplication();
            break;
            case 4 : op.division();
            break;
            default : System.out.println("Choose between 1 to 4");
            
        }
    } 
}
class operations{
    Scanner sc = new Scanner(System.in);
    void addition(){
    System.out.print("Enter value of a = ");
    int a = sc.nextInt();
    System.out.print("Enter value of b = ");
    int b = sc.nextInt();
    int c = a+b;
    System.out.println("Sum = "+c);
    }
    void subtraction(){
        System.out.print("Enter value of a = ");
    int a = sc.nextInt();
    System.out.print("Enter value of b = ");
    int b = sc.nextInt();
    int c = a-b;
    System.out.println("Difference = "+c);
    }
    void multiplication(){
        System.out.print("Enter value of a = ");
    int a = sc.nextInt();
    System.out.print("Enter value of b = ");
    int b = sc.nextInt();
    int c = a*b;
    System.out.println("Product = "+c);
    }
    void division(){
        System.out.print("Enter value of a = ");
    int a = sc.nextInt();
    System.out.print("Enter value of b = ");
    int b = sc.nextInt();
    int c = a/b;
    System.out.println("Quotient is = "+c);
    }
}
