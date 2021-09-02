import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Benches_ath_the_atrium {
    public static void main(String[] args) {
        int N, size;
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        size = sc.nextInt();
        List<Integer> stones = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            stones.add(sc.nextInt());
        }

        for (int i = 0; i < size; i++) {
            if (stones.get(i) == N / 2 && ((double) N / 2) > (double)(N / 2)) {
                System.out.println(N / 2);
                return;
            }
        }
        if (size == 1) {
            System.out.println(stones.get(0));
            return;
        }
        //поиск ближайшего камня слева и справа от центра масс
        int closestLeft = 0, closestRigth = 0, distanceLeft = 10001, distanceRigth = 10001;
        for (int i = 0; i < size; i++) {
            if (Math.abs(stones.get(i) - N / 2) < distanceLeft && stones.get(i) < N / 2) {
                distanceLeft = Math.abs(stones.get(i) - N / 2);
                closestLeft = stones.get(i);
            }
            if (Math.abs(stones.get(size - i - 1) - N / 2) < distanceRigth && stones.get(size - i - 1) >= N / 2) {
                distanceRigth = Math.abs(stones.get(size - i - 1) - N / 2);
                closestRigth = stones.get(size - i - 1);
            }
        }

        System.out.print(Math.min(closestLeft,closestRigth) + " ");
        System.out.println(Math.max(closestLeft,closestRigth));
    }
}
