import java.util.*;

public class Tolya_Carp_and_new_set_of_structures {
    public static void main(String[] args) {
        //количество посылок
        int N;
        Scanner scanner = new Scanner(System.in);
        N = Integer.parseInt(scanner.nextLine());
        Map<Long, Long> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();

            long first = Long.parseLong(input.split(" ")[0]);
            long second = Long.parseLong(input.split(" ")[1]);

            if (map.containsKey(first)) {
                map.put(first, map.get(first) + second);
            } else {
                map.put(first, second);
            }
        }

        List<Long> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for (Long key : keys) {
            System.out.println(key + " " + map.get(key));
        }

    }
}
