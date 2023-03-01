import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y%4==0){
            System.out.println("Leep Year");
        }else{
            System.out.println("Not Leap year");
        }
    }
}
