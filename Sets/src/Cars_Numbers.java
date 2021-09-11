import java.util.*;
import java.util.stream.Collectors;

public class Cars_Numbers {
    public static void main(String[] args) {
        // M - количество свидетелей
        // N - количество номеров
        int M, N;
        Scanner sc = new Scanner(System.in);
        M = Integer.parseInt(sc.nextLine());
        String[] indications = new String[M];

        for (int i = 0; i < indications.length; i++) {
            indications[i] = sc.nextLine();
        }

        N = Integer.parseInt(sc.nextLine());
        String[] numbers = new String[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextLine();
        }
        Map<String, Integer> scoring = new HashMap<>();

        for (int i = 0; i < N; i++) {
            scoring.put(numbers[i], 0);
        }

        for (Map.Entry<String, Integer> pair : scoring.entrySet()) {
            Set<Character> number = pair.getKey().chars().mapToObj( o -> (char)o).collect(Collectors.toSet());
            for (int i = 0; i < M; i++) {
                Set<Character> indication = indications[i].chars().mapToObj( o -> (char)o).collect(Collectors.toSet());
                if (number.containsAll(indication)) {
                    Integer temp = pair.getValue();
                    pair.setValue(temp + 1);
                }
            }
        }

        Optional<Integer> max = scoring.values().stream().max((o1, o2) -> {
            if (o1 > o2) return 1;
            if (o2 > o1) return -1;
            else return 0;
        });

        for (int i = 0; i < N; i++) {
            if (scoring.get(numbers[i]) == max.get()) {
                System.out.println(numbers[i]);
            }
        }
    }
}
