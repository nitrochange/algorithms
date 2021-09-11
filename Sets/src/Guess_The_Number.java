import java.util.*;
import java.util.stream.Collectors;

public class Guess_The_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.valueOf(scanner.nextLine());
        String Beatris_choice = scanner.nextLine();
        String Augist_answer = scanner.nextLine();
        Set<Integer> st = new TreeSet();
        for (int i = 0; i < N; i++) {
            st.add(i);
        }


        while(true) {

            List<Integer> Beatris_numbers = Arrays
                    .stream(Beatris_choice.split(" "))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());

            if (Augist_answer.equals("NO")) {
                st.removeAll(Beatris_numbers);
            } else {
                st= new TreeSet<>(Beatris_numbers);
            }

            Beatris_choice = scanner.nextLine();
            if (Beatris_choice.equals("HELP")) break;
            Augist_answer = scanner.nextLine();
        }

        for (Integer elem : st) {
            System.out.print(elem + " ");
        }
    }
}
