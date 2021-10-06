import java.util.Scanner;

public class Max_sums {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        long[] nums = new long[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }

        long ans = nums[0],
                sum = 0,
                min_sum = 0;
        for (int r = 0;  r <nums.length; ++r) {
            sum += nums[r];
            ans = Math.max (ans, sum - min_sum);
            min_sum = Math.min (min_sum, sum);
        }
        System.out.println(ans);
    }
}
