//super keyword is similar to this keyword.
//It is used to differentiate the members of superclass from the members of subclass, if they have same names.
//It is used to invoke the superclass constructor from subclass.
//‘super’ is a keyword used for variables of super class from sub class (super.a=a;)
//It is used to call a constructor of super class from constructor of sub class which should be first statement.(super(a,b);)
//It is used to call a super class method from sub class method to avoid redundancy of code (super.addNumbers(a, b))

class A {
    int num = 20;//data member of Super class
    public void display() // display method of superclass
    {
       System.out.println("Method of superclass");
    }
 }
 
 class B extends A {
    int num = 10; //data member of Sub class
    public void display() // display method of sub class
    {
       System.out.println("Method of subclass");
    }
 
    public void my_method() {
       // Instantiating subclass
       B sub = new B();
 
       // Invoking the display() method of sub class
       sub.display();
 
       // Invoking the display() method of super class
       super.display();
 
       // printing the value of variable num of subclass
       System.out.println("value of the variable named num in sub class:"+ sub.num);
 
       // printing the value of variable num of superclass
       System.out.println("value of the variable named num in super class:"+ super.num);
    }
 }
 class Inher3{
    public static void main(String args[]) 
    {
       B obj = new B();
       obj.my_method();
    }
 }
