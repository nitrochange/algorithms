import java.util.Scanner;
import java.util.Stack;

public class Right_brackets_sequence {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        st.push(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            if (st.empty()) {
                st.push(input.charAt(i));
            } else if (input.charAt(i) == ')' && st.peek() == '(') {
                st.pop();
            } else {
                st.push(input.charAt(i));
            }
        }
        if (st.empty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
