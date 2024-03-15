import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"cat", "dog", "cherry", "cat", "dog", "house", "apple", "cherry", "car", "cat", "dog"};
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}