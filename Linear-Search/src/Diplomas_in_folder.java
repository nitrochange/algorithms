import java.util.Scanner;

public class Diplomas_in_folder {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] folders = new int[N];
        for (int i = 0; i < N; i++) {
            folders[i] = sc.nextInt();
        }

        int result = 0;
        int max = -1;
        for (int i = 0; i < N; i++) {
            if (folders[i] > max) {
                max = folders[i];
            }
            result += folders[i];
        }
    }
}
