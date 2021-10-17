import java.util.*;

class Pair{

    int coordinate;
    boolean isLeft;

    public Pair(int coordinate, boolean isLeft) {
        this.coordinate = coordinate;
        this.isLeft = isLeft;
    }
}

public class Filling_Line {
    public static void main(String[] args) {
        int N;
        List<String> segments = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            segments.add(sc.nextLine());
        }

        Pair[] pairs = new Pair[2 * N];

        for (int i = 0; i < N; i++) {
            pairs[2 * i] = new Pair(Integer.parseInt(segments.get(i).split(" ")[0]), false);
            pairs[2 * i + 1] = new Pair(Integer.parseInt(segments.get(i).split(" ")[1]), true);
        }

        Comparator<Pair> comparator = Comparator.comparing(obj -> obj.coordinate);
        comparator = comparator.thenComparing(obj -> obj.isLeft);

        Arrays.sort(pairs, comparator);

        long result = 0;
        int c = 0;

        for (int i = 0; i < N * 2; i++) {
            if (c != 0) {
                result += Math.abs(pairs[i].coordinate - pairs[i-1].coordinate);
            }
            if (pairs[i].isLeft) ++c;
            else --c;
        }
        System.out.println(result);
    }
}
