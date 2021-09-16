import java.util.Scanner;

public class Prefix_sums {
    public static void main(String[] args) {
        int n, q;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        q = sc.nextInt();
        long[] numbers = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            numbers[i] = sc.nextInt() + numbers[i-1];
        }

        sc.nextLine();
        String[] input;
        for (int i = 0; i < q; i++) {
            input = sc.nextLine().split(" ");
            int leftIndex = Integer.parseInt(input[0]) ;
            int rightIndex = Integer.parseInt(input[1]) ;
            System.out.println(numbers[rightIndex] - numbers[leftIndex - 1]);
        }
    }
}
