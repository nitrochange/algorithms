import java.util.Scanner;

public class Problem_C {
    public static void main(String[] args) {
        int x,y,z,result = 0;
        String[] arr = new Scanner(System.in).nextLine().split(" ");

        x = Integer.parseInt(arr[0]);
        y = Integer.parseInt(arr[1]);
        z = Integer.parseInt(arr[2]);

        if ((x > 12 && y <= 12) || (x <= 12 && y > 12) ) {
            result = 1;
        }
        if (x == y) {
            result = 1;
        }
        System.out.println(result);
    }
}
