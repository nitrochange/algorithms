import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Have_Seen_Number_Before {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> st = new TreeSet<>();
        String[] numbers = sc.nextLine().split(" ");
        for (String number : numbers) {
            if (st.contains(Integer.valueOf(number))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                st.add(Integer.valueOf(number));
            }
        }
    }
}
