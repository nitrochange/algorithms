import java.util.*;
import java.util.stream.Collectors;

public class Unique_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        Set<Integer> st = new TreeSet<Integer>(
                Arrays.asList(numbers)
                        .stream()
                        .map(Integer::valueOf)
                        .collect(Collectors.toList()));


        Map<Integer, Integer> map = new HashMap<>();
        for (Integer elem : st) {
            map.put(elem, 0);
        }

        for (int i = 0; i < numbers.length; i++) {
            map.put(Integer.valueOf(numbers[i]), map.get(Integer.valueOf(numbers[i])) + 1);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (map.get(Integer.valueOf(numbers[i])) == 1) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
