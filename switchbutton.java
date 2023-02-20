import java.util.*;
public class switchbutton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1:Hello\n2:Namaste\n3:Bonjours");
        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjours");
            break;
            default : System.out.println("Invalid Button");
        }
    }
    
}
