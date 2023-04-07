
import java.util.Scanner;
class Student
{
    int rollno;
    String name;
    float per;
    Student()
    {
        rollno = 0;
        name = null;
        per = 0;
    }
    Student1(int rollno, String name, float per){
        this.rollno = rollno;
        this.name = name;
        this.per = per;
    }
    void display(){
        System.out.println("Rollno. is "+rollno+"\nName is "+name+"\nPercentage is "+per);
    }
}
public class StudentConstructor{
    public static void main(String[] args){
        int rollno;
        String name;
        float per;
        Scanner sc = new Scanner(System.in);
         
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student1(11,"Admin",89);
        s2.display();

        System.out.println("Enter rollno ");
        rollno = sc.nextInt();
        System.out.println("Enter name ");
        name = sc.nextLine();
        System.out.println("Enter percentage ");
        per = sc.nextFloat();
        Student s3 = new Student1(rollno,name,per);
    }
}
