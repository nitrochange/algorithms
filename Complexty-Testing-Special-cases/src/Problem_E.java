import java.util.Scanner;

public class Problem_E {

    private static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }

    public static void main(String[] args) {
        int d, x, y;
        int result = 0;
        Scanner sc = new Scanner(System.in);

        d = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();

        if (y <= -x + d && x >= 0 && y >= 0) {
            System.out.println(0);
            System.exit(0);
        }

        double xa = getDistance(0, 0, x,y);
        double xb = getDistance(d, 0, x,y);
        double xc = getDistance(0, d, x,y);

        if (xa == xb && xa == xc) {
            result = 1;
        } else if (xa == xb && xa < xc) {
            result = 1;
        } else if (xb == xc && xb < xa) {
            result = 2;
        } else if (xc == xa && xa < xb) {
            result = 1;
        } else {
            if (xa < xb) {
                if (xa < xc) {
                    result = 1;
                }
                else {
                    result = 3;
                }
            }
            else {
                if (xb < xc) {
                    result = 2;
                }
                else {
                    result = 3;
                }
            }
        }

        System.out.println(result);
    }
}
