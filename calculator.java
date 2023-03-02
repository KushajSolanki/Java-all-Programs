import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1:ADDITION");
        System.out.println("2:SUBTRACTION");
        System.out.println("3:MULTIPLICATION");
        System.out.println("4:DIVISION");
        int button = sc.nextInt();
        switch(button){
            case 1 : addition h=new addition(); h.display();
            break;
            case 2 : subtraction j=new subtraction(); j.display();
            break;
            case 3 : multiplication k=new multiplication(); k.display();
            break;
            case 4 : division l=new division(); l.display();
            break;
            default : System.out.println("Choose between 1 to 4");
            
        }
    } 
}
class addition{
    Scanner sc = new Scanner(System.in);
    void display(){
    System.out.print("Enter value of a = ");
    int a = sc.nextInt();
    System.out.print("Enter value of b = ");
    int b = sc.nextInt();
    int c = a+b;
    System.out.println("Sum = "+c);
    }
}
class subtraction{
    Scanner sc = new Scanner(System.in);
    void display(){
        System.out.print("Enter value of a = ");
    int a = sc.nextInt();
    System.out.print("Enter value of b = ");
    int b = sc.nextInt();
    int c = a-b;
    System.out.println("Difference = "+c);
    }
}
class multiplication{
    Scanner sc = new Scanner(System.in);
    void display(){
        System.out.print("Enter value of a = ");
    int a = sc.nextInt();
    System.out.print("Enter value of b = ");
    int b = sc.nextInt();
    int c = a*b;
    System.out.println("Product = "+c);
    }
}
class division{
    Scanner sc = new Scanner(System.in);
    void display(){
        System.out.print("Enter value of a = ");
    int a = sc.nextInt();
    System.out.print("Enter value of b = ");
    int b = sc.nextInt();
    int c = a/b;
    System.out.println("Quotient is = "+c);
    }
}
