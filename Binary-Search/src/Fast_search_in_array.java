import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Fast_search_in_array {

    // ищем индекс элемента elem в массиве arr
    static int binarySearch(List<Integer> arr, int elem, boolean isRight) {
        int left = -1, right = arr.size() - 1;
        int length;
        while (right - 1 > left) {
            length = (left + right) / 2;
            if (arr.get(length) == elem) {
                if (isRight) {
                    return arr.lastIndexOf(elem) == arr.size() -1 ? arr.lastIndexOf(elem) : arr.size();
                }
                else return arr.indexOf(elem);
            }
            if (arr.get(length) > elem) {
                right = length;
            } else {
                left = length;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        List<String> input =new ArrayList<>();
        try {
            input = Files.readAllLines(Paths.get("input.txt"), StandardCharsets.UTF_8);;

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        int N, K;
        N = Integer.parseInt(input.get(0));
        List<Integer> arr = new ArrayList<>();
        String[] numbers = input.get(1).split(" ");
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(numbers[i]));
        }

        Collections.sort(arr);
        K = Integer.parseInt(input.get(2));
        String[] pair;
        for (int i = 0; i < K; i++) {
            pair = input.get( i + 3).split(" ");
            System.out.println(binarySearch(arr, Integer.parseInt(pair[1]), true) -
                    binarySearch(arr, Integer.parseInt(pair[0]), false));
        }
    }

}
