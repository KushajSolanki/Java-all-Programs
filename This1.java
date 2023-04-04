//this: to refer current class instance variable
//If there is ambiguity between the instance variables and parameters
class Student{  
	int rollno;  
	String name;  
	double fee;  
	Student(int rollno,String name,float fee)
	{  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	} 
	/*Student(int r,String n,float fe){  
	rollno=r;  
	name=n;  
	fee=fe;  
	} */
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}  
}  
class This1{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000);  
Student s2=new Student(112,"sumit",6000);  
s1.display();  
s2.display();  
}
}   
