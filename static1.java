//Java Program to illustrate the use of static variable which  
//is shared with all objects. 

class static1
{  
    static int count=0;//As it is static variable it 
                      //will get memory only once and retain its value  
  
    int Counter2(int a)
	{  
    count++;//incrementing the value of static variable  
    System.out.println(count); 
    return a; 
    }  
  
	public static void main(String args[])
	{  
	//creating objects  
	Counter2 c1=new Counter2();  
	Counter2 c2=new Counter2();             /*output - 1,2,3 */
	Counter2 c3=new Counter2();  
    }  
} 