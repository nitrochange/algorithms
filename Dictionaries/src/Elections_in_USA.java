import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Elections_in_USA {
    public static void main(String[] args) {
        List<String> input =new ArrayList<>();
        try {
            input = Files.readAllLines(Paths.get("input.txt"), StandardCharsets.UTF_8);;

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        Map<String, Integer> voting = new HashMap<>();

        for (String vote: input) {
            String[] data = vote.split(" ");
            if (voting.containsKey(data[0])) {
                voting.put(data[0], voting.get(data[0]) + Integer.valueOf(data[1]));
            } else {
                voting.put(data[0], Integer.valueOf(data[1]));
            }
        }

        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(voting.entrySet());

        sorted.sort(Map.Entry.comparingByKey());

        for (Map.Entry<String, Integer> candidate : sorted) {
            System.out.println(candidate.getKey() + " " + candidate.getValue());
        }

    }
}
