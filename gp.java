import java.util.Scanner;
public class gp
{ 
  public static double SUM(int n)
  {
	double sum=0;
    for (int i = 1; i <= n; i++)
	{
            sum = sum+i/fact(i);
	}
    return sum;
  } 
  public static double fact(int n)
  {
	int fact = 1; 
    for (int i = 1; i <= n; i++) 
		{
            fact = fact * i; /*fact variable store factorial of the i.*/    
        }
	return fact;
  } 
  
  public static void main(String args[])
  { 
  Scanner ob1=new Scanner(System.in);
  System.out.println("Enter the number: ");
  int a=ob1.nextInt(); 
  double result=(SUM(a));
  System.out.println(result);  
  }  
}  

