import java.util.Scanner;

public class Problem_A {
    public static void main(String[] args) {
        int r; // код завершения задачи
        int i; //вердикт интерактора
        int c; //вердикт чекера
        int result = 0; //итоговый вердикт системы

        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        i = sc.nextInt();
        c = sc.nextInt();

        if (i == 0) {
            if (r != 0) {
                result = 3;
            } else {
                result = c;
            }
        }
        else if (i == 1) {
            result = c;
        }
        else if (i == 4) {
            if (r != 0) {
                result = 3;
            } else {
                result =4;
            }

        }
        else if (i == 6) {
            result = 0;
        }
        else if (i == 7) {
            result = 1;
        }
        else {
            result = i;
        }
        System.out.println(result);
    }
}
