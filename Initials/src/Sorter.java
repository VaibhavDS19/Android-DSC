import java.util.Scanner;

public class Sorter {
    public static void main(String[] args) {
        int n, count=0, temp;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            count=0;
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    count++;
                }
            }
            if(count==0)
                break;
        }
        for(int i=0;i<n;i++) System.out.println(a[i]);
    }
}
