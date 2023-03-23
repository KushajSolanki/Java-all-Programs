public class summation {
    public static void main(String args[])
    {
        int x = 21, sum = 0;
        // Do-while loop
        do 
		{
            // Execution statements(Body of loop)
            sum += x;
			System.out.println("Summation: " + sum);
            x--;
			System.out.println(x);	
        }while (x > 10);      // Now checking condition
        // Summing up
        //System.out.println("Summation: " + sum);
    }
}
