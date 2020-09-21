import java.util.Scanner;

public class Add2D {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] a = new int[m][n], b=new int[m][n], c=new int[m][n];
        System.out.println("Enter elements for array 1.");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j]= sc.nextInt();
        System.out.println("Enter elements for array 2.");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                b[i][j]= sc.nextInt();

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                c[i][j]=a[i][j]+b[i][j];

        System.out.println("Result array");
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}