//Hierarchical Inheritance
class Person 
{
	String name;
	int age;
	Person(String name,int age)
		{
		this.name=name;
		this.age=age;
		}
}
class Student extends Person 
{
	
	String roll = "19bcd1234";
	Student()
	{
	super("Ram",18);
	System.out.println(name+" "+age+" "+roll);
	}
}

class Faculty extends Person 
{
	
	String empid = "70054";
	Faculty()
	{
    super("Dr Shyam",28);
	System.out.println(name+" "+age+" "+empid);
	}
}
class heirinheritance
{
	public static void main(String ar[]) 
	{
		Student s = new Student();
		Faculty f = new Faculty();
	}
}