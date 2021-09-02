import java.util.Scanner;

public class Homes_and_shops {
    //0 - офис
    //1 - жилой дом
    //2 - магазин
    public static void main(String[] args) {
        int N = 10;
        Scanner sc = new Scanner(System.in);
        int[] buildings = new int[N];
        for (int i = 0; i < N; i++) {
            buildings[i] = sc.nextInt();
        }
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (buildings[i] == 1) {
                int distance = 10000;
                for (int j = 0; j < N; j++) {
                    if (buildings[j] == 2 && Math.abs(j - i) < distance) {
                        distance = Math.abs(j - i);
                    }
                }
                if (distance > result) {
                    result = distance;
                }
            }

        }
        System.out.println(result);
    }
}
