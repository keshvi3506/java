import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = sumN(N);
        System.out.print(sum);

        sc.close();
    }

    static int sumN(int n) {
        if (n == 0)
            return 0;
        return n + sumN(n - 1);
    }
}
