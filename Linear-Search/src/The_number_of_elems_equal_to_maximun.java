import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class The_number_of_elems_equal_to_maximun {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        int max = -1;
        while (temp != 0) {
            arr.add(temp);
            if (temp > max) {
                max = temp;
            }
            temp = sc.nextInt();
        }
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == max) {
                result++;
            }
        }
        System.out.println(result);
    }
}
