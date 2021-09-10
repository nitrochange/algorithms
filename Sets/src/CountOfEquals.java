import java.util.*;
import java.util.stream.Collectors;

public class CountOfEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> first = new TreeSet<>(), second = new TreeSet<>();

        String[] line1 = sc.nextLine().split(" ");
        String[] line2 = sc.nextLine().split(" ");
        for (int i = 0; i < line1.length; i++) {
            first.add(Integer.valueOf(line1[i]));
        }

        for (int i = 0; i < line2.length; i++) {
            second.add(Integer.valueOf(line2[i]));
        }

        first.retainAll(second);

        System.out.println(first.size());
    }
}
