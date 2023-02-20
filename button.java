import java.util.*;
public class button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1:Hello");
        System.out.println("2:Namaste");
        System.out.print("3:Bonjour\n");
        int a = sc.nextInt();
        if(a==1){
            System.out.println("Hello");
        }
        else if(a==2){
            System.out.println("Namaste");
        }
        else if(a==3){
            System.out.println("Bonjours");
        }
    }
}
