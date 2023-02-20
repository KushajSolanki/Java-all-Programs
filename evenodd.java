import java.util.*;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a%2==1){
            System.out.println("Odd");
        }
        else if (a<0){
            System.out.println("Number should be Positive");
        }
        else if (a==0){
            System.out.println("Number is zero");      
        }
        else{
            System.out.println("Even");
        }
    }
}
