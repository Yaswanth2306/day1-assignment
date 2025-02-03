import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "Hello, World!";
        input = input.toLowerCase().replaceAll("[^a-z]", ""); // Ignore case and remove special characters
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : input.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        freq.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}