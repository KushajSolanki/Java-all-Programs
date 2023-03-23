import java.util.Scanner;
class Demo{
	String name;
	String Rn;
	float Tm;
}
public class constructorpass{
public static void main(String ar[]){
	Demo d1=new Demo();
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the name");
	d1.name=ob.next();
	System.out.println("Enter the Rollno");
	d1.Rn=ob.next();
	System.out.println("Enter the Total marks");
	d1.Tm=ob.nextFloat();
	if(d1.Tm>=50.0)
		System.out.println("Pass");
	else
		System.out.println("Fail");	
	}
} 
