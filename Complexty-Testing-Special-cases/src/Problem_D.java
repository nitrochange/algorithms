import java.util.Scanner;

public class Problem_D {
    public static void main(String[] args) {
        //количество учеников
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int result = sc.nextInt();
            if (i == N / 2) {
                System.out.println(result);
                break;
            }
        }

    }
}
