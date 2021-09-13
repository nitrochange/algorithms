import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Frequency_Analysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        try {
            input = Files.readAllLines(Paths.get("input.txt"), StandardCharsets.UTF_8);;
        } catch (IOException e) {
            e.printStackTrace();
        }
       for ( String line : input){
            String[] words = line.split(" ");
            for (String word : words) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 0);
                }
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(((o1, o2) -> {
            if (o1.getValue() > o2.getValue()) return -1;
            else if (o1.getValue() < o2.getValue()) return 1;
            else return o1.getKey().compareTo(o2.getKey());
        }));

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> pair : result.entrySet()) {
            System.out.println(pair.getKey());
        }

    }
}
