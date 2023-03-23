public class arraysumavg {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        double average;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            sum += a[i];
            System.out.println("Sum is "+sum);
        }
        average = (sum/a.length);
        System.out.println("Average is "+average); 
    }
}
