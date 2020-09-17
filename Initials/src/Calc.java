import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Sum = "+(a+b));
        System.out.println("Difference = "+(a-b));
        System.out.println("Product = "+(a*b));
        if(b!=0)
            System.out.println("Quotient = "+(a/b));
        else
            System.out.println("Can't divide by 0.");
    }
}
