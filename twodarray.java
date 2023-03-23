public class twodarray {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6, 9}, {7}, };
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
        System.out.println("\n");
        for(int i=0;i<a.length;i++){
          for(int j=0;j<a[i].length;j++){
            System.out.print(a[i][j]);
          }
          System.out.println("\n");
        }
    }
  }

