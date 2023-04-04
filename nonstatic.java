
//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class. 
class nonstatic
	{  
	int count=0;//will get memory each time when the 
	            //instance is created  
	  
	int Counter1(int a)
	{  
	count++;//incrementing value  
	System.out.println(count); 
	return a;
	}  
	  
	public static void main(String args[]) 
	{  
	//Creating objects  
	Counter1 c1=new Counter1();       
	Counter1 c2=new Counter1();  		/*output - 1,1,1 */
	Counter1 c3=new Counter1();  
	}  
}  