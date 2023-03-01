import java.util.*;
public class grading{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int m3 = in.nextInt();
        int m4 = in.nextInt();
        int s = m1 + m2 + m3 + m4;
        int a = s/4;
        System.out.println("Total is : "+s);
        System.out.println("Average is "+a);
        if(a>=91 && a<=100){
            System.out.println("Grade is S");
        }else if(a>=81 && a<=90){
            System.out.println("Grade is A");
        }else if (a>=71 && a<=80){
            System.out.println("Grade is B");
        }else if (a>=61 && a<=70){
            System.out.println("Grade is C");
        }else{
            System.out.println("Failed");
        }
    }
}
