public class arraytransverse {
    public static void main(String[] args) {
        double[] a = new double[] {4,8,9};
        double[] b = new double[3];
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
            System.out.println(b[i]);
        }
    }
}
