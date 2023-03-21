class ParentClass{
	int a;
	ParentClass(int a){
		System.out.println("Inside ParentClass parameterized constructor!");
		this.a = a;
	}
	ParentClass(){
		System.out.println("Inside ParentClass default constructor!");
	}
}
class ChildClass extends ParentClass{

	ChildClass(){
		System.out.println("Inside ChildClass constructor!!");		
	}
}
public class ConstructorInInheritance {

	public static void main(String[] args) {

		ChildClass obj = new ChildClass();

	}

}