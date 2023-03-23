import java.util.Scanner;
class Garea
{
	double r,l,b;
	int a;
	void getdim(double r1,double l1,double b1,int a1)
	{
		r=r1;
		l=l1;
		b=b1;
		a=a1;
	}
	double Rarea()
	{
		return l*b;
	}
	double Carea()
	{
		double pi=3.14;
		return pi*r*r;
	}
	int Sarea()
	{
		return a*a;
	}
	
}
class constructorarea{
public static void main(String ar[]){
	Garea d1=new Garea();
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the radius");
	d1.r=ob.nextDouble();
	System.out.println("Enter the length");
	d1.l=ob.nextDouble();
	System.out.println("Enter the breadth");
	d1.b=ob.nextDouble();
	System.out.println("Enter the side");
	d1.a=ob.nextInt();
	d1.getdim(d1.r,d1.l,d1.b,d1.a);
	System.out.println("Area of rectangle "+d1.Rarea());
	System.out.println("Area of rectangle "+d1.Carea());
	System.out.println("Area of rectangle "+d1.Sarea());
}
} 