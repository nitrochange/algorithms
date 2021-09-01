import java.util.Scanner;

public class Problem_B {
    public static void main(String[] args) {
        //N - общее количество станций
        // i, j - станции на которых садится и выходит
        int N, i, j;

        String[] arr = new Scanner(System.in).nextLine().split(" ");

        N = Integer.parseInt(arr[0]);
        i = Integer.parseInt(arr[1]);
        j = Integer.parseInt(arr[2]);

        System.out.println(Math.min(Math.abs(i-j)-1, Math.min(i,j) + N - Math.max(i,j) - 1));
    }
}
