public class SumOverload {
    public static void main(String[] args) {
        int sum;
        sum = add(1, 2);
        System.out.println(sum);
        sum = add(3, 4, 5);
        System.out.println(sum);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
