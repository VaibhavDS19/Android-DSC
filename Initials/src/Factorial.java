import java.util.Scanner;
    public class Factorial {
        public static void main(String[] args) {
            int n, facto=1;
            Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                facto*=i;
            }
            System.out.println(facto);
        }
    }
