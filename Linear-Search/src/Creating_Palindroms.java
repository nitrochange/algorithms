import java.util.Scanner;

public class Creating_Palindroms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int bill = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                bill++;
            }
        }
        System.out.println(bill);
    }
}
