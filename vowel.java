import java.util.Scanner;
public class vowel
{
    public static void main(String[] args)
    {
		Scanner ob1=new Scanner(System.in);
        char b=ob1.next().charAt(0);
		//System.out.println(b);
        // Switch statement with int data type
        switch (b) 
		{
        case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
		         System.out.println(b + " is VOWEL");
		         break;
		default:
                System.out.println(b + " is Consonant");	
	    }        
    }
}

