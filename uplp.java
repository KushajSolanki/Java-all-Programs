//program to change upper case to lower case
import java.util.*;
class uplp
{
 public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	String s,r;
	System.out.println("Enter a String");
	s=sc.next();
	System.out.println(s);
	r=Srep(s);
	System.out.println("Lower case "+r);
	}
 
 public static String Srep(String s)
	 {
		char c,C;
		int i;
		for(i=0;i<s.length();i++)
		{ 
	    C=s.charAt(i);
		if(C>=65&&C<=90)
			{
			c=(char)(C+32);
			s=s.replace(C,c);
			} 
		}
		return s;
	 }
}