import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int n, fibo=1, f1=0, f2=1;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int i=2;
        if(n<2){
            System.out.println(n);
            return;
        }
        while(i<=n)
        {
            fibo=f1+f2;
            f1=f2;
            f2=fibo;
            i++;
        }
        System.out.println(fibo);
    }
}
